package com.example.ExamenChuchi.CabeceraFra.application;

import com.example.ExamenChuchi.CabeceraFra.domain.CabeceraFra;

public interface CabeceraFraService {

    void createCabeceraFra(CabeceraFra cabeceraFra) throws Exception;
    CabeceraFra readCabeceraFraById(String id);
    void modifyCabeceraFra(CabeceraFra cabeceraFra);
    void deleteCabeceraFraById(String id);

}
