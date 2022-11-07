package com.qualco.qualcoassignment.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "COUNTRY_LANGUAGES")
public class CountryLanguage {
  @EmbeddedId
  private CountryLanguageId countryLanguageId;

  @ManyToOne
  @MapsId("countryId")
  private Country countryId;

  @ManyToOne
  @MapsId("Language_Id")
  private Language languageId;

  private Long official;

}
