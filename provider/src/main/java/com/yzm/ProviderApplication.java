package com.yzm;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 17:39
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("com.yzm.mapper")
public class ProviderApplication {

    //这是main方法，是程序的入口
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
