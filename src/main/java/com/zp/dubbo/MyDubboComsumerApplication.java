package com.zp.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class MyDubboComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDubboComsumerApplication.class, args);
    }

}
