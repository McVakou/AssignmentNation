package com.qualco.qualcoassignment.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name = "REGIONS")
public class Region {

  @Id
  @Column(name = "region_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long regionId;

  @NotNull
  @Column(length = 100, nullable = false)
  private String name;

  @NotNull
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "continent_id")
  private Continent continent;
}
