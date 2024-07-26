package com.example.controller;

import com.example.model.NotificationMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @MessageMapping("/notify")
    @SendTo("/topic/notifications")
    public NotificationMessage send(NotificationMessage message) throws Exception {
        // Simulate a delay to show asynchronous behavior
        Thread.sleep(1000);
        return new NotificationMessage("Notification: " + message.getContent());
    }
}
