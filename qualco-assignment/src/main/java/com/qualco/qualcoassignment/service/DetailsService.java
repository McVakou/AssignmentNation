package com.qualco.qualcoassignment.service;

import com.qualco.qualcoassignment.dtos.DetailDTO;

import java.util.List;

public interface DetailsService {
  List<DetailDTO> fetchDetails();
}
