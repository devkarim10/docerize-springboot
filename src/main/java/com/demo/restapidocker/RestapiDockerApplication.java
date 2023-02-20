package com.demo.restapidocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestapiDockerApplication {

    @GetMapping("/message")
    public String getFullName(){
        return "Hello, I am a java backend developer";
    }

    public static void main(String[] args) {
        SpringApplication.run(RestapiDockerApplication.class, args);
    }

}
