package com.qualco.qualcoassignment.repository;

import com.qualco.qualcoassignment.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor; //, JpaSpecificationExecutor<Continent>
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {


}