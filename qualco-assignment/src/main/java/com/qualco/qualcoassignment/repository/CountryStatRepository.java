package com.qualco.qualcoassignment.repository;

import com.qualco.qualcoassignment.entity.CountryStat;
import com.qualco.qualcoassignment.entity.CountryStatId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryStatRepository extends JpaRepository<CountryStat, CountryStatId> {

    @Query(
            value = "SELECT A.* FROM COUNTRY_STATS A GROUP BY A.country_id HAVING MAX(A.gdp / A.population)",
            nativeQuery = true)
    List<CountryStat> findMaxGdpPerPopulationRatioStat();

}
