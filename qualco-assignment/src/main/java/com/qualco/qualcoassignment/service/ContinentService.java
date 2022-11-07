package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.entity.Continent;

import java.util.List;
import java.util.Optional;

public interface ContinentService {
    Optional<Continent> findById(Long continentId);

    List<Continent> findAll();
}
