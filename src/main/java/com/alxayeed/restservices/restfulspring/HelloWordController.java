package com.alxayeed.restservices.restfulspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping(path = "/hello-world")
    public String helloWolrd(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWolrdBean(){
        return new HelloWorldBean("Hello World");
    }
}