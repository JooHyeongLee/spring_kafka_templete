package com.example.spring_kafka_templete.kafka;

import com.example.spring_kafka_templete.common.LogHandler;
import com.example.spring_kafka_templete.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserConsumer {
    private final UserService userService;

    @KafkaListener(topics= "Hello", groupId = "User")
    public void hello(String message) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", message);
        LogHandler.setLog("I", "Templete", "", "Hello", result);
    }
}
