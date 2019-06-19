package com.stackroute.controller;

import com.stackroute.engine.Car;
import com.stackroute.engine.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class ProducerController {

    @Autowired
    Producer producer;

    @PostMapping("/produce")
    public String hellokafkaproducer(@RequestBody Car car) {
        producer.send(car);
        return "Produced to kafka";
    }
}






