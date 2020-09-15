package com.example.producer.web;

import com.example.producer.dto.AgeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@RestController
public class AgeController {

    @GetMapping("/age")
    public ResponseEntity<AgeDto> isNumberPrime(@RequestParam("year") String date) throws ParseException {
        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Period period = Period.between(birth, now);

        return ResponseEntity.ok(new AgeDto(period.getYears(), "male"));
    }

}
