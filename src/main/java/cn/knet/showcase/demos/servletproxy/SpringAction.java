package cn.knet.showcase.demos.servletproxy;

import cn.knet.showcase.demos.annotation.DataValidate;
import cn.knet.showcase.demos.springmvc.service.UserService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "")
public class SpringAction {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserService userService;

	@RequestMapping("/find_psw.html")
	public void test(String message, HttpServletRequest request, HttpServletResponse response){
		String uri = "http://blog.sina.com.cn/s/blog_496b2a650102vp2d.html?tj=1".replace("http://", "");

		int i = uri.indexOf("/");
		String requestURI = uri.substring(i);
		String hostname = uri.substring(0, i);

		request.setAttribute(ProxyServlet.ATTR_TARGET_URI, requestURI);
		request.setAttribute(ProxyServlet.ATTR_TARGET_HOST, new HttpHost(hostname, 80));

		ProxyServlet proxyServlet = new ProxyServlet();
		try {
			proxyServlet.service(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}