package com.example.ExamenChuchi.LineaFra.application;

import com.example.ExamenChuchi.LineaFra.domain.LineasFra;

public interface LineasFraService {

    void createLineasFra(LineasFra lineasFra);
    void readLineasFraById(String id);
    void modifyLineasFra(LineasFra lineasFra);
    void deleteLineasFraById(String id);
}
