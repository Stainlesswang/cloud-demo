package com.allen.consumer.service;


import com.allen.consumer.bean.User;
import org.springframework.stereotype.Component;

/**
 * @author AllenWong
 * @date 2019/10/15 10:50 AM
 */
@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello(String name) {
        return "this is fallback";
    }

    @Override
    public User hello(String name, int age) {
        return new User("UnKnow",10);
    }

    @Override
    public String hello(User user) {
        return "this is fallback";
    }
}
