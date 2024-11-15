package com.spring.kafka.kafkaProducerConsumer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    public static  final  String TOPIC ="SampleTest";

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void sendMessage(Object msg){
        kafkaTemplate.send(TOPIC,msg);
    }


}
