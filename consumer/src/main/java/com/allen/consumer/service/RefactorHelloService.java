package com.allen.consumer.service;

import com.allen.baseapi.service.HelloService;
import com.allen.consumer.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author AllenWong
 * @date 2019/10/11 5:40 PM
 */
@FeignClient("PROVIDER")
@Component
public interface RefactorHelloService extends HelloService {

}
