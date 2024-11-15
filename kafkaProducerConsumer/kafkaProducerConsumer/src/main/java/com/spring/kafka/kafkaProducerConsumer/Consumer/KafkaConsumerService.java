package com.spring.kafka.kafkaProducerConsumer.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "SampleTest",groupId = "1")
    public void listen(Object msg){
        System.out.println("msg received");
    }
}
