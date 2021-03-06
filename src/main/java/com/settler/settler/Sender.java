package com.settler.settler;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        Entity entity = new Entity();
        entity.setName("lin");
        entity.setPass("boxuan");
        System.out.println("entity send :" + entity.getName() + "/" +entity + entity.getPass());
        this.rabbitTemplate.convertAndSend("hello2", entity);
    }
}
