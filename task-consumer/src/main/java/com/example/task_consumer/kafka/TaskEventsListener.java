package com.example.task_consumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class TaskEventsListener {
    @KafkaListener( topics="task-events", groupId="task-consumer")
    public void onMessage(String message) {
        System.out.println("[EVENT RECEIVED] " + message);
        
    }
}
