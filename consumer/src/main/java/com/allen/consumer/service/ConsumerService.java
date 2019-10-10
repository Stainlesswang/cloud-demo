package com.allen.consumer.service;

import com.allen.consumer.command.DemoCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author AllenWong
 * @date 2019/10/9 2:56 PM
 */
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "failBack")
    public String consumer(){
        String PROVIDE_ADDRESS = "HTTP://provider/";
        return restTemplate.getForObject(PROVIDE_ADDRESS +"provider",String.class);
    }

    public String failBack(){
        return "fail return";
    }

    public String consumer(long id){
        return new DemoCommand(restTemplate,1l).execute();
    }
}
