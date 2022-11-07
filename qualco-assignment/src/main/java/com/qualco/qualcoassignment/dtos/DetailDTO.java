package com.qualco.qualcoassignment.dtos;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class DetailDTO {

  private Long countryId;
  private String continentsName;
  private String regionsName;
  private String countriesName;
  private Long year;
  private BigDecimal gdp;
  private Long population;
}
