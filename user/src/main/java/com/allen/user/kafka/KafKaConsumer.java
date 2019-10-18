package com.allen.user.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author AllenWong
 * @date 2019/10/14 4:42 PM
 */
@Component
public class KafKaConsumer {
    @KafkaListener(topics = "allen_topic_test",groupId = "allen_kafka2")
    public void listen(ConsumerRecord<?,?> record){
        Optional<?> kafkaMessage=Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()){
            Object message=kafkaMessage.get();
            System.out.println("*****************");
            System.out.println(message);
            System.out.println("*****************");
        }

    }
}
