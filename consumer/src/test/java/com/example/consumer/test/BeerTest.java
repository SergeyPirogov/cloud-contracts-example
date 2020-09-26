package com.example.consumer.test;

import com.example.consumer.web.BeerController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class BeerTest extends BaseTest {
    @Autowired
    private BeerController beerController;

    @BeforeEach
    public void setupPort() {
        this.beerController.setPort(this.producerPort);
    }

    @Test
    public void given_WhenPassEvenNumberInQueryParam_ThenReturnEven()
            throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/beer?year=29/07/1989")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"age\":31,\"beerAllowed\":true,\"sex\":\"male\"}"));
    }
}
