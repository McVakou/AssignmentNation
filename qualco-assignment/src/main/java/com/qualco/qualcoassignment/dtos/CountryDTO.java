package com.qualco.qualcoassignment.dtos;


import com.qualco.qualcoassignment.entity.Region;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class CountryDTO implements Serializable {
    private Long countryId;
    private String name;
    private Double area;
    private Date nationalDay;
    private String countryCode2;
    private String countryCode3;
    private RegionDTO regionDTO;

}
