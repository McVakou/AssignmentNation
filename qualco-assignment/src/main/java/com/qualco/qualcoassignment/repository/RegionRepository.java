package com.qualco.qualcoassignment.repository;

import com.qualco.qualcoassignment.dtos.RegionDTO;
import com.qualco.qualcoassignment.entity.Country;
import com.qualco.qualcoassignment.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long>, JpaSpecificationExecutor<Region> {
  //Region findByRegionId(Long regionId);
}