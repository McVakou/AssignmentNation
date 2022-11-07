package com.qualco.qualcoassignment.controllers;

import com.qualco.qualcoassignment.dtos.CountryStatDTO;
import com.qualco.qualcoassignment.service.CountryStatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/countryStats")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET})
public class CountryStatsController {

    private final CountryStatService countryStatService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CountryStatDTO>> fetchMaxGdpPerPopulationRatioStats(){
        //List<CountryStatDTO> countryStatDTOList = countryStatService.findMaxGdpPerPopulationRatioStat();
        List<CountryStatDTO> countryStatDTOList = countryStatService.findMaxGdpPerPopulationRatio();
        return new ResponseEntity<>(countryStatDTOList, HttpStatus.OK);
    }
}

