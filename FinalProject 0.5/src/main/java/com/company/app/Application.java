package com.company.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.company")
@EntityScan(basePackages = "com.company.models")
@EnableJpaRepositories(basePackages = "com.company.repositories")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
