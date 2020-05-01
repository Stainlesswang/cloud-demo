package com.allen.consumer.service;

import com.allen.baseapi.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author AllenWong
 * @date 2019/10/11 5:40 PM
 */
@FeignClient(value = "PROVIDER2")
@Component
public interface RefactorHelloService extends HelloService {

}
