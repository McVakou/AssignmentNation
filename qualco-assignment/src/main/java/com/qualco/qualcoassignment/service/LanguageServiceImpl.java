package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.dtos.LanguageDTO;
import com.qualco.qualcoassignment.entity.Language;
import com.qualco.qualcoassignment.mapper.LanguageMapper;
import com.qualco.qualcoassignment.repository.LanguageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;
    private final LanguageMapper languageMapper;

    public List<LanguageDTO> findByCountryId(Long countryId){
        List<Language> listLanguages = languageRepository.findByCountryId(countryId);
        return languageMapper.toDTOList(listLanguages);
    }

}
