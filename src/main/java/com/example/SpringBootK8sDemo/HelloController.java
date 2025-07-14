package com.example.SpringBootK8sDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello ! This is a Spring Boot application running in a Kubernetes cluster.";
    }
}