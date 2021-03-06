package com.settler.settler;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 翟永超
 * @create 2016/9/25.
 * @blog http://blog.didispace.com
 */
@Component
@RabbitListener(queues = "hello2")
public class Receiver {

    @RabbitHandler
    public void process(Entity entity) {
        System.out.println("user receive  : " + entity.getName()+"/"+entity.getPass());
    }

}
