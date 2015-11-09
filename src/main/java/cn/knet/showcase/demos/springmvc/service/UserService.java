package cn.knet.showcase.demos.springmvc.service;

import org.springframework.stereotype.Service;

/**
 * Created by zhangwenling on 2015/11/6.
 */
@Service
public class UserService {


    public void doExecute(String username, String passwrod) {
        System.out.println(username + ":" + passwrod);

    }
}
