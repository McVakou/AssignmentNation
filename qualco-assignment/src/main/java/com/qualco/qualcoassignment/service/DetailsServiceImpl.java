package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.dtos.CountryStatDTO;
import com.qualco.qualcoassignment.dtos.DetailDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailsServiceImpl implements DetailsService{



  @PersistenceContext
  EntityManager entityManager;

//  public List<DetailDTO> findMaxGdpPerPopulationRatio() {
//    Query q =
//            entityManager.createNativeQuery(
//                    " select c.country_id, c.name, c.country_code3 ,cs.year, cs.population, cs.gdp " +
//                            "from countries c, country_stats cs " +
//                            "where c.country_id = cs.country_id " +
//                            "GROUP BY cs.country_id " +
//                            "HAVING MAX(cs.gdp / cs.population)",
//                    "CountryStatDTO");
//    List<DetailDTO> data = (List<DetailDTO>) q.getResultList();
//    return data;
//  }



  @Override
  public List<DetailDTO> fetchDetails() {
    Query q =
            entityManager.createNativeQuery(
                    " select countries.country_id, continents.name as continentsName," +
                            "regions.name as regionsName, " +
                            "countries.name as countriesName, " +
                            "country_stats.year, country_stats.population, country_stats.gdp " +
                            "from continents, regions, countries, country_stats " +
                            "where countries.region_id = regions.region_id " +
                            "and regions.continent_id = continents.continent_id " +
                            "and country_stats.country_id = countries.country_id ",
                    "DetailDTO");
    List<DetailDTO> data = (List<DetailDTO>) q.getResultList();
    return data;
  }
}
