package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.entity.Continent;
import com.qualco.qualcoassignment.repository.ContinentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional(readOnly = true)
public class ContinentServiceImpl implements ContinentService {

    private ContinentRepository continentRepository;

    @Autowired
    ContinentServiceImpl (ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    public Optional<Continent> findById(Long continentId) {
        return continentRepository.findById(continentId);
    }

    @Override
    public List<Continent> findAll() {
        return continentRepository.findAll();
    }

}
