package com.example.consumer.web;

import com.example.consumer.dto.LoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TakeCreditController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/credit")
    public ResponseEntity<String> askForCredit(@RequestParam("clientId") String clientId, @RequestParam("amount") long amount) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");

        HttpEntity<LoanRequest> entity = new HttpEntity<>(new LoanRequest(clientId, amount));

        return restTemplate.exchange(
                "http://localhost:8086/fraudcheck",
                HttpMethod.PUT,
                entity,
                String.class);
    }
}
