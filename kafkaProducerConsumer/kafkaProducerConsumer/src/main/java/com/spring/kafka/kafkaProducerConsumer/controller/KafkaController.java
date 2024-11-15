package com.spring.kafka.kafkaProducerConsumer.controller;

import com.spring.kafka.kafkaProducerConsumer.Producer.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @GetMapping("/send")
    public String sendMessage() {
        kafkaProducerService.sendMessage("Hello, Kafka!");
        return "Message sent!";
    }
}
