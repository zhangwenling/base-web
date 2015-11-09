package cn.knet.showcase.demos.jms.simple;

import java.util.HashMap;
import java.util.Map;

import javax.jms.Destination;

import org.springframework.jms.core.JmsTemplate;

/**
 * JMS用户变更消息生产者.
 * 
 * 使用jmsTemplate将用户变更消息分别发送到queue与topic.
 * 
 * @author calvin
 */

public class NotifyMessageProducer {

	private JmsTemplate jmsTemplate;
	private Destination notifyQueue;
	private Destination notifyTopic;

	public void sendTextMessageQueue(String textMessage) {
		sendMessage(textMessage, notifyQueue);
	}

	public void sendTopic(Map user) {
		sendMessage(user, notifyTopic);
	}

	/**
	 * 使用jmsTemplate最简便的封装convertAndSend()发送Map类型的消息.
	 */
	private void sendMessage(Object user, Destination destination) {

		jmsTemplate.convertAndSend(destination, user);
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void setNotifyQueue(Destination notifyQueue) {
		this.notifyQueue = notifyQueue;
	}

	public void setNotifyTopic(Destination nodifyTopic) {
		this.notifyTopic = nodifyTopic;
	}
}
