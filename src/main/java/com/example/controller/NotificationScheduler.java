package com.example.controller;

import com.example.model.NotificationMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NotificationScheduler {

    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(fixedRate = 5000)
    public void sendNotification() {
        NotificationMessage message = new NotificationMessage("Scheduled Notification");
        template.convertAndSend("/topic/notifications", message);
    }
}
