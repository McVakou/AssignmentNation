package com.qualco.qualcoassignment.service;


import com.qualco.qualcoassignment.dtos.RegionDTO;
import com.qualco.qualcoassignment.entity.Region;
import com.qualco.qualcoassignment.mapper.RegionMapper;
import com.qualco.qualcoassignment.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {

  private final RegionRepository regionRepository;
  private final RegionMapper regionMapper;

  @Override
  public RegionDTO getById(Long regionId) {
    Optional<Region> region = regionRepository.findById(regionId);
    RegionDTO regionDTO = regionMapper.regionToRegionDto(region.get());
    return regionDTO;
  }

  @Override
  public List<RegionDTO> findAll() {
    return regionMapper.toDTOList(regionRepository.findAll());
  }

}
