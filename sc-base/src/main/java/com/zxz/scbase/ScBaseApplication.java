package com.zxz.scbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ScBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScBaseApplication.class, args);
    }

}
