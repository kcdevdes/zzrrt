package com.kcdevdes.zzrrt.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getGreetingMessage() {
        return "Greetings from Spring Boot!";
    }
}
