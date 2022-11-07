package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.dtos.LanguageDTO;

import java.util.List;

public interface LanguageService {

    List<LanguageDTO> findByCountryId(Long countryId);
}
