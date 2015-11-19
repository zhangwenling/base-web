package cn.knet.showcase.demos.springmvc.service;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by zhangwenling on 2015/11/6.
 */
@Service
public class UserService {

    private Logger logger = org.slf4j.LoggerFactory.getLogger(UserService.class);

    @Async
    public void doExecute(String username, String passwrod) {

        logger.debug("username:{},password:{}",username,passwrod);

        try {
            Thread.currentThread().sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
