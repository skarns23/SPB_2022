package io.nams.rest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class UserRestApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(UserRestApp.class);
        app.run(args);
        }
}
