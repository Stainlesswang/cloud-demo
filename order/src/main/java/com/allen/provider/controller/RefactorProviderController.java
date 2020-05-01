package com.allen.provider.controller;

import com.allen.baseapi.dto.User;
import com.allen.baseapi.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AllenWong
 * @date 2019/10/12 11:06 AM
 */
@RestController
public class RefactorProviderController implements HelloService {
    private Logger logger=LoggerFactory.getLogger(RefactorProviderController.class);

    @Override
    public String hello(String name) {
        logger.info("hello My {}!",name);
        return "Hello Feign "+name;
    }

    @Override
    public User hello(String name, int age) {
        logger.info("hello2 My name={},age={}!",name,age);
        return new User(name,age);
    }

    @Override
    public String hello(User user) {
        logger.info("hello3 My name={},age={}!",user.getName(),user.getAge());
        return "hello3 My name=" +user.getName()+ ",age=" +user.getAge();
    }
}
