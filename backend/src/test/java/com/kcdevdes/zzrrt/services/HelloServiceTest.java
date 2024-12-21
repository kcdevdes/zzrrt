package com.kcdevdes.zzrrt.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloServiceTest {
    private final HelloService helloService;

    public HelloServiceTest(HelloService helloService) {
        this.helloService = helloService;
    }

    @Test
    void should_return_greeting_message() {
        String result = helloService.getGreetingMessage();
        Assertions.assertThat(result).isEqualTo("Greetings from Spring Boot!");
    }
}
