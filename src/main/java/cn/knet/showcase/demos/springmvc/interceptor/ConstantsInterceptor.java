package cn.knet.showcase.demos.springmvc.interceptor;

import cn.knet.showcase.demos.annotation.DataValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.print.attribute.HashDocAttributeSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhangwenling on 2015/11/2.
 */
public class ConstantsInterceptor extends HandlerInterceptorAdapter {

    private final Logger logger = LoggerFactory.getLogger(ConstantsInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("{}", handler);

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            DataValidate dataValidate = handlerMethod.getMethod().getAnnotation(DataValidate.class);
            if (dataValidate != null) {
                String value = dataValidate.value();
                logger.debug("====>>>{}", value);
            }
        }

       /* if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            MethodParameter[] methodParameters = handlerMethod.getMethodParameters();
            for (MethodParameter methodParameter : methodParameters){
                methodParameter.getParameterAnnotations();
            }
            RequestMapping annotation = handlerMethod.getMethod().getAnnotation(RequestMapping.class);
            String[] values = annotation.value();
            for (String value : values){
                logger.debug(value);
            }
        }*/
        return super.preHandle(request, response, handler);
    }
}
