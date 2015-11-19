package cn.knet.showcase.demos.springmvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.knet.showcase.demos.annotation.DataValidate;
import cn.knet.showcase.demos.springmvc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.knet.showcase.demos.jms.simple.NotifyMessageProducer;
import cn.knet.showcase.demos.utils.StringUtils;
import sun.security.util.Password;

@Controller
@RequestMapping(value = "/mvc")
public class SpringMvcAction {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	@RequestMapping(value = {"/test.html", "/test1.html"})
	@ResponseBody
	@DataValidate("abc,def")
	public String test(String message, HttpServletRequest request, HttpServletResponse response){
		System.err.println(request.getMethod());
		String username = "zhangsan";
		String password = "123456";
		System.out.println("service 调用开始");
		userService.doExecute(username, password);
		System.out.println("service 调用结束");

		return "ok";
	}
	
}