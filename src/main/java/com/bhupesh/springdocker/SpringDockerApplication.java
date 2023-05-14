package com.bhupesh.springdocker;

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
    public ResponseEntity<String> welcome() {
        String message = "This application uses git actions to build docker image";
        return ResponseEntity.status(HttpStatus.OK).body("{\"message\": \"" + message + "\"}");
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}