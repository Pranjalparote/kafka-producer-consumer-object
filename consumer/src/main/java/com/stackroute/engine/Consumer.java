package com.stackroute.engine;

import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;



public class Consumer {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Consumer.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

//    @KafkaListener(topics ="myTopic")
//    public void receive(String payload) {
//        System.out.println(payload);
//        LOGGER.info("received payload='{}'", payload);
//        System.out.println(payload + "hello");
//        latch.countDown();
//    }


    @KafkaListener(topics = "myTopic")
    public void receive(Car car) {
        System.out.println(car.toString());
        LOGGER.info("received payload='{}'", car.toString());
        latch.countDown();
    }
}








