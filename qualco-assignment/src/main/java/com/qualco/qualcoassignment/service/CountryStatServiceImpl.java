package com.qualco.qualcoassignment.service;


import com.qualco.qualcoassignment.dtos.CountryStatDTO;
import com.qualco.qualcoassignment.repository.CountryStatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryStatServiceImpl implements CountryStatService {

    private final CountryStatRepository countryStatsRepository;
    @PersistenceContext
    EntityManager entityManager;

    public List<CountryStatDTO> findMaxGdpPerPopulationRatio() {
        Query q =
                entityManager.createNativeQuery(
                        " select c.country_id, c.name, c.country_code3 ,cs.year, cs.population, cs.gdp " +
                                "from countries c, country_stats cs " +
                                "where c.country_id = cs.country_id " +
                                "GROUP BY cs.country_id " +
                                "HAVING MAX(cs.gdp / cs.population)",
                        "CountryStatDTO");
        List<CountryStatDTO> data = (List<CountryStatDTO>) q.getResultList();
        return data;
    }

    @Override
    public List<CountryStatDTO> findAll() {
        return null;
    }

}
