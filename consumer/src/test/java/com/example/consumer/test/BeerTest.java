package com.example.consumer.test;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class BeerTest extends BaseTest {

    @Test
    public void given_WhenPassEvenNumberInQueryParam_ThenReturnEven()
            throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/beer?year=29/07/1989")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"age\":31,\"beerAllowed\":true,\"sex\":\"male\"}"));
    }
}
