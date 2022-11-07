package com.qualco.qualcoassignment.controllers;

import com.qualco.qualcoassignment.dtos.RegionDTO;
import com.qualco.qualcoassignment.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/region")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET})
public class RegionController {

    private final RegionService regionService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RegionDTO>> fetchAll(){
        List<RegionDTO> regionDTOList = regionService.findAll();
        return new ResponseEntity<>(regionDTOList, HttpStatus.OK);
    }

}
