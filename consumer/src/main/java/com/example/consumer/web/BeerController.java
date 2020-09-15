package com.example.consumer.web;

import com.example.consumer.dto.AgeDto;
import com.example.consumer.dto.BeerResponse;
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
public class BeerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/beer")
    public ResponseEntity<BeerResponse> checkOddAndEven(@RequestParam("year") String year) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");

        ResponseEntity<AgeDto> responseEntity = restTemplate.exchange(
                "http://localhost:8086/age?year=" + year,
                HttpMethod.GET,
                new HttpEntity<>(httpHeaders),
                AgeDto.class);

        AgeDto ageDto = responseEntity.getBody();
        int age = ageDto.getAge();
        boolean beerAllowed = age > 18;
        return ResponseEntity.ok(new BeerResponse(age, ageDto.getSex(), beerAllowed));
    }

}
