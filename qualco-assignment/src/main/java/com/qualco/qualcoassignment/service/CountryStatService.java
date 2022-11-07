package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.dtos.CountryStatDTO;

import java.util.List;

public interface CountryStatService {
  List<CountryStatDTO> findMaxGdpPerPopulationRatio();

  List<CountryStatDTO> findAll();
}
