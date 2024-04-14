package com.levmin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.levmin.mapper")
public class DemoApp {
    public static void main(String[] args) {
        System.out.println("开始");
        SpringApplication.run(DemoApp.class, args);
    }
}
