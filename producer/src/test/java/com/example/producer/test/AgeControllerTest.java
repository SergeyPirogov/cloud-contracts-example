package com.example.producer.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
public class AgeControllerTest extends BaseTest {

    @Autowired
    protected MockMvc mockMvc;

//    @Test
//    public void given_WhenPassEvenNumberInQueryParam_ThenReturnEven()
//            throws Exception {
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/age?year=29/07/1989")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string("{\"age\":31,\"sex\":\"male\"}"));
//    }
}
