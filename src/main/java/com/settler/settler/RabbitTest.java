package com.settler.settler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitTest {
    @Autowired
    private Sender sender;
    @Autowired
    private Sender2 sender2;

    @PostMapping("/hello")
    public void hello() {
        for(int i = 0;i < 10;i++) {
            sender.send();
            sender2.send();
        }
    }

}
