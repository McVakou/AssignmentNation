package com.qualco.qualcoassignment.dtos;


import lombok.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class CountryStatDTO implements Serializable {

  private Long countryId;
  private Long year;
  private String name;
  private String countryCode3;
  private BigDecimal gdp;
  private Long population;
}
