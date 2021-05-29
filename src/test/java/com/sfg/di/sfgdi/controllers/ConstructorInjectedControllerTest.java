package com.sfg.di.sfgdi.controllers;

import com.sfg.di.sfgdi.services.ConstructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new ConstructorGreetingService());

    }
    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
