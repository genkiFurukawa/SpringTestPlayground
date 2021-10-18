package com.example.sample.controller;

import com.example.sample.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    private final SampleService sampleService;

    SampleController(
            SampleService sampleService
    ) {
        this.sampleService = sampleService;
    }

    @GetMapping(value = "hello")
    public String hello() {
        return sampleService.sample();
    }

}
