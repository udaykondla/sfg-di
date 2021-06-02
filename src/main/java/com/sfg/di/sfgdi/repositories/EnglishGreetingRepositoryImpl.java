package com.sfg.di.sfgdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String sayGreeting() {
        return "Hellow world!! -- english repository";
    }
}
