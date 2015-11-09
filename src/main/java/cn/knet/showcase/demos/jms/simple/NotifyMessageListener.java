package cn.knet.showcase.demos.jms.simple;

import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息的异步被动接收者.
 * 
 * 使用Spring的MessageListenerContainer侦听消息并调用本Listener进行处理.
 * 
 * @author calvin
 */
public class NotifyMessageListener implements MessageListener {

	private static Logger logger = LoggerFactory.getLogger(NotifyMessageListener.class);


	/**
	 * MessageListener回调函数.
	 */
	public void onMessage(Message message) {
		try {
			TextMessage mapMessage = (TextMessage) message;
			// 打印消息详情
			logger.info("接受到消息========》{}", mapMessage.getText());
		} catch (Exception e) {
			logger.error("处理消息时发生异常.", e);
		}
	}
}
