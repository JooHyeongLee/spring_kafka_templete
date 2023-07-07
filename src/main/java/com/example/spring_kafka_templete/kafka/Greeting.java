package com.example.spring_kafka_templete.kafka;

import lombok.Data;

@Data
public class Greeting {
    private String id;
    private String type;


    public Greeting(String id, String type) {
        this.id = id;
        this.type = type;
    }
}
