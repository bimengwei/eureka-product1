package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProduct1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProduct1Application.class, args);
    }

}
