package com.sfg.di.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating Singleton bean");
    }

    public String getMyScope() {
        return "Singleton scope";
    }
}
