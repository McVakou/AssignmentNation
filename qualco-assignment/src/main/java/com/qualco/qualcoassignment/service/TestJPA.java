package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.dtos.DetailDTO;
import com.qualco.qualcoassignment.dtos.RegionDTO;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TestJPA {

//	@Autowired
//	OrderService orderService;
//
//	@Autowired
//	CustomerService customerService;

  @Autowired
  ContinentService continentService;
  @Autowired
  CountryService countryService;

  @Autowired
  CountryStatService countryStatService;

  @Autowired
  RegionService regionService;

  @Autowired
  DetailsService detailsService;


  @EventListener(ApplicationReadyEvent.class)
  void testJpa() {

    List<RegionDTO> listRegion = regionService.findAll();
    System.out.println(listRegion);

    List<DetailDTO> listDetails = detailsService.fetchDetails();
    System.out.println(listDetails);
  }
}
