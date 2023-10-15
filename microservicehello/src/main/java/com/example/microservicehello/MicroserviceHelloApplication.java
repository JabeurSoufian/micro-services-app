package com.example.microservicehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceHelloApplication {

    @RequestMapping("/")
    public String helloFromMicroService() {
        return "Hello from micro-service";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceHelloApplication.class, args);
    }

}
