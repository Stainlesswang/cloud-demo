package com.allen.baseapi.service;

import com.allen.baseapi.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author AllenWong
 *
 * 在该包下边定义所有的Service接口,
 * 实现fegin调用的时候只需要实现该接口的
 *
 * @date 2019/10/11 5:40 PM
 */
@RequestMapping("/refactor")
public interface HelloService {

    @RequestMapping(value = "/helloName2",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/helloGetUser2",method = RequestMethod.GET)
    public User hello(@RequestHeader(value = "name") String name, @RequestHeader(value = "age") int age);

    @RequestMapping(value = "/helloPostUser2",method = RequestMethod.POST)
    public String hello(@RequestBody User user);



}
