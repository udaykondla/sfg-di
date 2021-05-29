package com.sfg.di.sfgdi.controllers;

import com.sfg.di.sfgdi.services.ConstructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void testGetGreetingService() {
        System.out.println(controller.getGreeting());
    }
}
