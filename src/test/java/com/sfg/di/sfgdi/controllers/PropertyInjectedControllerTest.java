package com.sfg.di.sfgdi.controllers;

import com.sfg.di.sfgdi.services.ConstructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
