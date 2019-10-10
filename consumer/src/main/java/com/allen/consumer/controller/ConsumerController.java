package com.allen.consumer.controller;

import com.allen.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author AllenWong
 * @date 2019/10/9 9:48 AM
 */
@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/consumer")
    public String consumer(){
        return consumerService.consumer();
    }
}
