package com.allen.user.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author AllenWong
 * @date 2019/10/14 4:39 PM
 */
@Component
public class KafKaSender {
    @Autowired
    KafkaTemplate kafkaTemplate;

    public void senMessage(String topicName,String  jsonMessage){
        kafkaTemplate.send(topicName,jsonMessage);
    }
}
