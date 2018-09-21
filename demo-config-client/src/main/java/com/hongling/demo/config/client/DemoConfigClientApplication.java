package com.hongling.demo.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigClientApplication.class, args);
    }
}
