package com.virtualpet.battles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BattleServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BattleServiceApplication.class, args);
    }

    @RestController
    static class HelloController {
        @GetMapping("/")
        String hello() {
            return "Battle service running";
        }
    }
}
