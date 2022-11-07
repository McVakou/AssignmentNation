package com.qualco.qualcoassignment.mapper;

import com.qualco.qualcoassignment.dtos.CountryDTO;
import com.qualco.qualcoassignment.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface CountryMapper {

    CountryDTO toDTO(Country country);

    Country toCountry(CountryDTO countryDTO);

    List<CountryDTO> toDTOList(List<Country> countries);

    List<Country> toList(List<CountryDTO> countryDTOS);
}
