package com.bhupesh.springdocker;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {

    @GetMapping("/welcome")
    public ResponseEntity<welcomeMessage> welcome() {
        String message = "This application uses git actions to build docker image";
        welcomeMessage responseMessage = new welcomeMessage(message);
        return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
    }

    @GetMapping("/health")
    public ResponseEntity<healthCheckMessage> health() {
        String message = "Application is up and running ...!";
        LocalDateTime currentTime = LocalDateTime.now();
        healthCheckMessage responseMessage = new healthCheckMessage(message, currentTime);
        return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
    }

    public static class welcomeMessage {
        private final String message;

        public welcomeMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static class healthCheckMessage {
        private final String message;
        private final LocalDateTime serverTime;

        public healthCheckMessage(String message, LocalDateTime serverTime) {
            this.message = message;
            this.serverTime = serverTime;
        }

        public String getMessage() {
            return message;
        }

        public LocalDateTime getServerTime() {
            return serverTime;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

}
