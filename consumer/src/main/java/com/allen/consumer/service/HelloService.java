package com.allen.consumer.service;

import com.allen.consumer.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author AllenWong
 * @date 2019/10/11 5:40 PM
 */
@FeignClient("PROVIDER2")
@Component
public interface HelloService {

    @RequestMapping(value = "/helloName",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/helloGetUser",method = RequestMethod.GET)
    public User hello(@RequestHeader(value = "name") String name, @RequestHeader(value = "age") int age);

    @RequestMapping(value = "/helloPostUser",method = RequestMethod.POST)
    public String hello(@RequestBody User user);



}
