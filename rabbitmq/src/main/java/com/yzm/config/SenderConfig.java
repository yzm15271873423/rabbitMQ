package com.yzm.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: yzm
 * @Date: 2021/6/16 - 06 - 16 - 10:05
 */

@Configuration
public class SenderConfig {

    @Bean
    protected Queue queue(){
        return new Queue("DemoQueue");
    }
}
