package com.allen.consumer.controller;

import com.allen.consumer.bean.User;
import com.allen.consumer.service.ConsumerService;
import com.allen.consumer.service.HelloService;
import com.allen.consumer.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author AllenWong
 * @date 2019/10/9 9:48 AM
 */
@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;
    @Autowired
    HelloService helloService;
    @Autowired
    RefactorHelloService refactorHelloService;


    @RequestMapping("/consumer")
    public String consumer(){
        return consumerService.consumer();
    }

    @RequestMapping(value = "/feignConsumer",method = RequestMethod.GET)
    public String feignConsumer(@PathParam("name")String name){
        return helloService.hello(name);
    }


    @RequestMapping("/feignConsumer2")
    public String feignConsumer(){
        return helloService.hello("DIDI") + "\n" +
                helloService.hello("DIDI", 30) + "\n" +
                helloService.hello(new User("DIDI", 30)) + "\n";
    }

    /**
     * 使用继承依赖Base API项目实现的 RefactorHelloService实现的接口,不用重复写HelloService中的接口定义
     * @return
     */
    @RequestMapping("/feignConsumerExtend")
    public String feignConsumerExtend(){
        return refactorHelloService.hello("DIDI") + "\n" +
                refactorHelloService.hello("DIDI", 30) + "\n" +
                refactorHelloService.hello(new com.allen.baseapi.dto.User("DIDI", 30)) + "\n";
    }
}
