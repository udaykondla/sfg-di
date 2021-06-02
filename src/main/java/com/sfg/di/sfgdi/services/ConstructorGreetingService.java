package com.sfg.di.sfgdi.services;

import org.springframework.stereotype.Service;

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "hello world!!! - constructor";
    }

}
