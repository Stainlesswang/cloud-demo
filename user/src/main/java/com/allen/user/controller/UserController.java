package com.allen.user.controller;

import com.allen.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AllenWong
 * @date 2020/5/1 10:29 PM
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/isEnough")
    public boolean isEnough(@RequestParam Integer id,@RequestParam Long money){
        return userService.isEnough(id,money);

    }
}
