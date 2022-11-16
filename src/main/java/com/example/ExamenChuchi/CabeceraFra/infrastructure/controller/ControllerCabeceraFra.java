package com.example.ExamenChuchi.CabeceraFra.infrastructure.controller;


import com.example.ExamenChuchi.CabeceraFra.application.CabeceraFraServiceImpl;
import com.example.ExamenChuchi.CabeceraFra.domain.CabeceraFra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerCabeceraFra {

    @Autowired
    CabeceraFraServiceImpl cabeceraFraService;

    @PostMapping("factura/add")
    public void addFactura(@RequestBody CabeceraFra cabeceraFra) throws Exception {
        cabeceraFraService.createCabeceraFra(cabeceraFra);
    }
}
