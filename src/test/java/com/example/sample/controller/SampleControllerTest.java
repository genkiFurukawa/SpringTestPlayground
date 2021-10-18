package com.example.sample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

// NOTE: static importするとテストコードを短く書ける
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class SampleControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void testHello() throws Exception {
        mockMvc.perform(
                get("/hello").accept(MediaType.TEXT_PLAIN)
        ).andExpect(
                status().is2xxSuccessful()
        ).andExpect(
                content().string("sample foo")
        );
    }

}
