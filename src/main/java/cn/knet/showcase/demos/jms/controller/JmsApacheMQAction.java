package cn.knet.showcase.demos.jms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.knet.showcase.demos.jms.simple.NotifyMessageProducer;

@Controller
@RequestMapping(value = "/jms")
public class JmsApacheMQAction {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private NotifyMessageProducer notifyMessageProducer;
	
	@RequestMapping(value = "/send.html", method = RequestMethod.POST)
	public String send(String message, HttpServletRequest request, HttpServletResponse response){
		for (int i = 0; i < 50; i++) {
			notifyMessageProducer.sendTextMessageQueue(message + i);
		}
		return null;
	}
	
}