package com.kcdevdes.zzrrt.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void should_return_greeting_message() {
        String message = helloService.getGreetingMessage();
        Assertions.assertThat(message).isEqualTo("Greetings from Spring Boot!");
    }
}

