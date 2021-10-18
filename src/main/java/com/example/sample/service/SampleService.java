package com.example.sample.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private final FooService fooService;

    SampleService(
            FooService fooService
    ) {
        this.fooService = fooService;
    }

    public String sample() {
        return "sample" + " " + fooService.foo();
    }
}
