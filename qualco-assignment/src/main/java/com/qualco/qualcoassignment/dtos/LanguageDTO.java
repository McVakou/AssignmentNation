package com.qualco.qualcoassignment.dtos;


import lombok.Data;

import java.io.Serializable;

@Data
public class LanguageDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer languageId;
    private String language;

}
