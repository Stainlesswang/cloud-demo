package com.allen.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AllenWong
 * @date 2019/10/11 5:40 PM
 */
@FeignClient("PROVIDER")
@Component
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

}
