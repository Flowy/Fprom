package com.flowyk.fprom.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.flowyk.fprom")
@EnableJpaRepositories(basePackages = "com.flowyk.fprom")
@EntityScan(basePackages = "com.flowyk.fprom")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
