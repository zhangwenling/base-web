package logback;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
	private static final Logger logger = LoggerFactory.getLogger(LogbackDemo.class);
	
	private static final Logger monitorLogger = LoggerFactory.getLogger("monitor");
	
	public static void main(String[] args) throws Exception {
//		for (int i = 0; i < 100000; i++) {
		monitorLogger.debug("==========debug==============");
		monitorLogger.info("==========info==============");
		monitorLogger.warn("==========warn==============");
		monitorLogger.error("==========error==============");
//			Thread.currentThread().sleep(1*1000);
//		}
		Integer.parseInt("", 16);
		System.err.println();
	}
}
