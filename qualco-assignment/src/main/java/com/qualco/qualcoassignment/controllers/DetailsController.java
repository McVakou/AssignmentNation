package com.qualco.qualcoassignment.controllers;

import com.qualco.qualcoassignment.dtos.DetailDTO;
import com.qualco.qualcoassignment.service.DetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/details")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET})
public class DetailsController {

  private final DetailsService detailsService;

  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<DetailDTO>> fetchAll() {
    List<DetailDTO> listdetailDTO = detailsService.fetchDetails();
    return new ResponseEntity<>(listdetailDTO, HttpStatus.OK);
  }
}
