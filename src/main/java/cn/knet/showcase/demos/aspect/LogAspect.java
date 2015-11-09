package cn.knet.showcase.demos.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by zhangwenling on 2015/11/6.
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(public * cn.knet.showcase.demos.springmvc.service..*.*(..))")
    public void recordLog() {
    }

    @Before("recordLog()")
    public void beforeLog() {
        System.out.println("============before============");

    }

    @After("recordLog()")
    public void afterLog() {
        System.out.println("============After============");
    }

    @Around("recordLog()")
    public void aroundLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("============Around before============");
        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
            arg = args.toString() + "update";
        }
        pjp.proceed();

        System.out.println("============Around after============");
    }
}
