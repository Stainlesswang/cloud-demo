package com.allen.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.allen.user.mapper")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
//        ConfigurableApplicationContext context=SpringApplication.run(UserApplication.class, args);

//        KafKaSender kafKaSender= context.getBean(KafKaSender.class);
//        for (int i = 0; i <100 ; i++) {
//            kafKaSender.senMessage("allen_topic_test","sssssss"+i);
//        }
    }

}
