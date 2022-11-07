package com.qualco.qualcoassignment.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "REGION_AREAS")
public class RegionArea {
  @Id
  @Column(updatable = false)
  private String regionName;
  @NotNull
  @Column(nullable = false)
  private String regionArea;
}
