package com.qualco.qualcoassignment.service;


import com.qualco.qualcoassignment.dtos.CountryDTO;
import com.qualco.qualcoassignment.entity.Country;
import com.qualco.qualcoassignment.mapper.CountryMapper;
import com.qualco.qualcoassignment.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

  private final CountryRepository countryRepository;

  @Autowired
  private final CountryMapper countryMapper;
  @Override
  public CountryDTO findById(Long countryId) {
    Optional<Country> country = countryRepository.findById(countryId);
    CountryDTO countryDTO= countryMapper.toDTO(country.get());
    return countryDTO;
  }

  @Override
  public List<CountryDTO> findAllByOrderByCountryIdAsc() {
    List<Country> countryList = countryRepository.findAllByOrderByCountryIdAsc();
    List<CountryDTO> listCountryDTO = countryMapper.toDTOList(countryList);
    return listCountryDTO;
  }

  @Override
  public List<CountryDTO> findAll() {
    List<Country> countryList = countryRepository.findAll();
    List<CountryDTO> listCountryDTO = countryMapper.toDTOList(countryList);
    return listCountryDTO;
  }
}
