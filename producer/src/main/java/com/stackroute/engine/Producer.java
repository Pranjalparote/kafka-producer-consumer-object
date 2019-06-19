package com.stackroute.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {
    @Value("${kafka.topic.json}")
    private String jsonTopic;

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Producer.class);

    @Autowired
    private KafkaTemplate<String, Car> kafkaTemplate;

    public void send(Car car) {
        LOGGER.info("sending payload='{}'", car.toString());
        kafkaTemplate.send(jsonTopic, car);
    }
}











