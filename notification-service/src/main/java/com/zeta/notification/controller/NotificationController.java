package com.zeta.notification.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @PostMapping("/send")
    public String sendNotification(@RequestBody String message) {
        // In real app: connect to email/SMS service
        return "Notification sent: " + message;
    }
}

