package com.qualco.qualcoassignment.mapper;


import com.qualco.qualcoassignment.dtos.RegionDTO;
import com.qualco.qualcoassignment.entity.Region;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface RegionMapper {

    RegionDTO regionToRegionDto(Region region);

    Region toRegion(RegionDTO regionDTO);

    List<RegionDTO> toDTOList(List<Region> regions);

    List<Region> toList(List<RegionDTO> regionDTOS);
}
