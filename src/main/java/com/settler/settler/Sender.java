package com.settler.settler;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("Sender:" + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
