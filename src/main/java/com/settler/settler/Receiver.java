package com.settler.settler;

@Component
@RabbitListener(queues = "hello")
public class Receiver {
}
