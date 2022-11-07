package com.qualco.qualcoassignment.controllers;

import com.qualco.qualcoassignment.dtos.LanguageDTO;
import com.qualco.qualcoassignment.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/language")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST})
public class LanguageController {

    private final LanguageService languageService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LanguageDTO>> fetchByCountryId(@PathVariable("id") Long countryId){
        List<LanguageDTO> languageDTOList = languageService.findByCountryId(countryId);
        return new ResponseEntity<>(languageDTOList, HttpStatus.OK);
    }

}
