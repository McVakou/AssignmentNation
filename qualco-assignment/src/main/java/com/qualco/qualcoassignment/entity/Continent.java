package com.qualco.qualcoassignment.entity;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "CONTINENTS")
//(name = "idGenerator", sequenceName = "CONTINENTS_SEQ", initialValue = 1, allocationSize = 1)
public class Continent {

  @Id
  @Column(nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long continentId;
  @NotNull
  @Column(nullable = false)
  private String name;
}
