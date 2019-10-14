package com.allen.user;

import com.allen.user.kafka.KafKaSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(UserApplication.class, args);
        KafKaSender kafKaSender= context.getBean(KafKaSender.class);
        for (int i = 0; i <3 ; i++) {
            kafKaSender.senMessage("allen_topic_test","message"+i);
        }
    }

}
