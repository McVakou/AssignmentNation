package com.qualco.qualcoassignment.mapper;


import com.qualco.qualcoassignment.dtos.LanguageDTO;
import com.qualco.qualcoassignment.entity.Language;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface LanguageMapper {

    LanguageDTO toDTO(Language language);

    Language toLanguage(LanguageDTO languageDTO);

    List<LanguageDTO> toDTOList(List<Language> languages);

    List<Language> toList(List<LanguageDTO> languageDTOS);
}
