package com.allen.provider.controller;

import com.allen.provider.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author AllenWong
 * @date 2019/10/7 5:37 PM
 */
@RestController
public class ProviderController {
    private Logger logger=LoggerFactory.getLogger(ProviderController.class);

    @RequestMapping("/provider")
    public String provider()  {
        logger.info("请求到新接口!");
        return "This is Provider!";
    }

    @RequestMapping(value = "/helloName",method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        logger.info("hello My {}!",name);
        return "Hello Feign "+name;
    }

    @RequestMapping(value = "/helloGetUser",method = RequestMethod.GET)
    public User hello(@RequestHeader String name,@RequestHeader int age) {
        logger.info("hello2 My name={},age={}!",name,age);
        return new User(name,age);
    }

    @RequestMapping(value = "/helloPostUser",method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
        logger.info("hello3 My name={},age={}!",user.getName(),user.getAge());
        return "hello3 My name=" +user.getName()+ ",age=" +user.getAge();
    }
}
