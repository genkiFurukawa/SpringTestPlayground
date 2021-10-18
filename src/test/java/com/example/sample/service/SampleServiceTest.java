package com.example.sample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SampleServiceTest {
    @Autowired
    SampleService sampleService;

    @Test
    void testSample() {
        assertEquals("sample foo", sampleService.sample());
    }
}
