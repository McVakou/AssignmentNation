//package com.qualco.qualcoassignment.mapper;
//
//
//import com.qualco.qualcoassignment.dtos.CountryStatDTO;
//import com.qualco.qualcoassignment.entity.CountryStat;
//import org.mapstruct.Mapper;
//import org.mapstruct.NullValueCheckStrategy;
//
//import java.util.List;
//
//@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
//public interface CountryStatMapper {
//
//  CountryStatDTO toDTO(CountryStat countryStat);
//
//  CountryStat toCountryStat(CountryStatDTO countryStatDTO);
//
//  List<CountryStatDTO> toDTOList(List<CountryStat> countryStat);
//
//  List<CountryStat> toList(List<CountryStatDTO> countryStatDTOS);
//}
