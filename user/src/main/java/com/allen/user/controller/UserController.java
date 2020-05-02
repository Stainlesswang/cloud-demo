package com.allen.user.controller;

import com.allen.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AllenWong
 * @date 2020/5/1 10:29 PM
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final Logger log=LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @RequestMapping("/isEnough")
    public boolean isEnough(@RequestParam Integer id,@RequestParam Long money){
        return userService.isEnough(id,money);

    }

    @RequestMapping("/userMoney")
    public boolean userMoney(@RequestParam Integer id,@RequestParam Long money){
        log.info("扣减金币id={},扣减数={}",id,money);
        return userService.useMoney(id,money);

    }
}
