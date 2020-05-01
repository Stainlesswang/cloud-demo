package com.allen.user.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author AllenWong
 * @date 2019/10/14 4:42 PM
 */
@Component
public class KafKaConsumer {
//    @KafkaListener(topics = "allen_topic_test",groupId = "allen_kafka")
//    public void listen(ConsumerRecords<String, String>records){
//        for (ConsumerRecord<String, String> record:records){
//            Optional<?> kafkaMessage=Optional.ofNullable(record.value());
//            if (kafkaMessage.isPresent()){
//                Object message=kafkaMessage.get();
//                System.out.println("*****************");
//                System.out.println(message);
//            }
//        }
//        System.out.println("*****************本次消费数量:"+records.count());
//
//    }
}
