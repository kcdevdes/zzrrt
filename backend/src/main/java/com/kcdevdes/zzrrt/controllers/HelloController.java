package com.kcdevdes.zzrrt.controllers;

import com.kcdevdes.zzrrt.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    /**
     * Test Method
     */
    @GetMapping("/greeting")
    String getGreeting() {
        return helloService.getGreetingMessage();
    }
}
