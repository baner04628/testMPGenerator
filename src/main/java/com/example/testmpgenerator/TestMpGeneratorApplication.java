package com.example.testmpgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.testmpgenerator.mapper")
public class TestMpGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMpGeneratorApplication.class, args);
    }

}
