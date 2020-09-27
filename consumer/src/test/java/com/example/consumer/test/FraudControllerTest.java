package com.example.consumer.test;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class FraudControllerTest extends BaseTest{

    @Test
    void testFraudControllerAmountFraud() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/credit?amount=99999&clientId=1234567890")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"fraudCheckStatus\":\"FRAUD\",\"rejection.reason\":\"Amount too high\"}"));
    }

    @Test
    void testFraudControllerAmountOk() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/credit?amount=9999&clientId=1234567890")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"fraudCheckStatus\":\"OK\",\"acceptance.reason\":\"Amount OK\"}"));
    }
}
