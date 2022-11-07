package com.qualco.qualcoassignment.entity;

import com.qualco.qualcoassignment.dtos.CountryStatDTO;
import com.qualco.qualcoassignment.dtos.DetailDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
import java.math.BigDecimal;


@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "COUNTRY_STATS")
@SqlResultSetMapping(
        name = "CountryStatDTO",
        classes =
        @ConstructorResult(
                targetClass = CountryStatDTO.class,
                columns = {
                        @ColumnResult(name = "country_id", type = Long.class),
                        @ColumnResult(name = "year", type = Long.class),
                        @ColumnResult(name = "name", type = String.class),
                        @ColumnResult(name = "country_Code3", type = String.class),
                        @ColumnResult(name = "gdp", type = BigDecimal.class),
                        @ColumnResult(name = "population", type = Long.class)
                }))

@SqlResultSetMapping(
        name = "DetailDTO",
        classes =
        @ConstructorResult(
                targetClass = DetailDTO.class,
                columns = {
                        @ColumnResult(name = "country_id", type = Long.class),
                        @ColumnResult(name = "continentsName", type = String.class),
                        @ColumnResult(name = "regionsName", type = String.class),
                        @ColumnResult(name = "countriesName", type = String.class),
                        @ColumnResult(name = "year", type = Long.class),
                        @ColumnResult(name = "gdp", type = BigDecimal.class),
                        @ColumnResult(name = "population", type = Long.class)
                }))
public class CountryStat {
  @EmbeddedId
  private CountryStatId id;

  @Column(name = "population")
  private Long population;

  @Column(name = "gdp", precision = 15)
  private BigDecimal gdp;

  public CountryStatId getId() {
    return id;
  }
}
