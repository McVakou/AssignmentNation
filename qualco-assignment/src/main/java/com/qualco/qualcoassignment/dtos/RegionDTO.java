package com.qualco.qualcoassignment.dtos;


import com.qualco.qualcoassignment.entity.Continent;
import lombok.Data;

import java.io.Serializable;

@Data
public class RegionDTO implements Serializable {
    private Long regionId;

    private String name;

    private Continent continent;

}
