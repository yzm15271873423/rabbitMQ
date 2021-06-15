package com.yzm;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 19:32
 */

@SpringBootApplication
@EnableDubbo
public class ProductApplication {
    //这是main方法，是程序的入口
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
