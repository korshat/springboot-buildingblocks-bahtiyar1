package com.stacksimplify.restservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld(){
        return "Hello world from spring boot";
    }
    @RequestMapping("/goodbye")
    public String goodbye(){
        return "Goodbye from Spring Boot";
    }
}
