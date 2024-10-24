package com.thuocle.hello_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloSpringController {
    @GetMapping("/hello/")
    String sayHello(@RequestParam( name = "name", required = false, defaultValue = "World") String name) {
        return "Hello Spring Boot3 and " + name + "!";
    }

    @GetMapping("/hello2/{name}")
    String sayHello2(@PathVariable String name) {
        return "Hello Spring Boot3 and " + name + "!";
    }
}
