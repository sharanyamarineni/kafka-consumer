package com.zemoso.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {
    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void listen(String message) {
        System.out.println("consumed message"+ message);
    }
}