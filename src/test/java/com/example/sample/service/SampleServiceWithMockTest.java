package com.example.sample.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @MockBeanを使ったテストのサンプル
 */
@SpringBootTest
public class SampleServiceWithMockTest {
    @Autowired
    SampleService sampleService;

    // モック化されたBeanはモックではないBeanとは別物になる
    // 毎回生成されるので時間がかかる
    @MockBean
    FooService fooService;

    @Test
    void testSample() {
        // NOTE: mockの振る舞いを定義
        // NOTE: fooService.foo()を呼び出したら、mockと返す
        Mockito.when(fooService.foo()).thenReturn("mock");

        assertEquals("sample mock", sampleService.sample());
    }
}
