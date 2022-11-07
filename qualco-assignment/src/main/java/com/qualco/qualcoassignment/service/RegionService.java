package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.dtos.RegionDTO;

import java.util.List;

public interface RegionService {

    RegionDTO getById(Long regionId);

    List<RegionDTO> findAll();
}
