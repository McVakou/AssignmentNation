package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.dtos.CountryDTO;

import java.util.List;

public interface CountryService {

  CountryDTO findById(Long countryId);
  public List<CountryDTO> findAllByOrderByCountryIdAsc();

  public List<CountryDTO> findAll();
}
