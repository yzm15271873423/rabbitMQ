package com.yzm.comonent;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: yzm
 * @Date: 2021/6/16 - 06 - 16 - 10:11
 */

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(Object obj){
        amqpTemplate.convertAndSend("DemoQueue",obj);
    }


}
