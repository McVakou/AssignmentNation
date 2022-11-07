package com.qualco.qualcoassignment.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "COUNTRIES")
public class Country {
  @Id
  @Column(name = "country_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long countryId;

  @Column(length = 50)
  private String name;
  @NotNull
  @Column(precision = 10, scale = 2, nullable = false)
  private Double area;
  private Date nationalDay;

  @NotNull
  @Column(length = 2, unique = true, nullable = false)
  private String countryCode2;
  @NotNull
  @Column(length = 3, unique = true, nullable = false)
  private String countryCode3;

  @NotNull
  @ManyToOne(fetch = FetchType.EAGER)//TODO make this lazy
  @JoinColumn(name = "region_id")
  private Region region;

}



/*

name varchar 50
area decimal 10,2 notNull
nationa_day DATE
country_code2 char2 UNIQUIE
country_code3 char3 UNIQUIE
region_id int(11) FK
ciytruscol varchar(45)
 */