package com.example.ExamenChuchi.LineaFra.infrastructure.controller;

import com.example.ExamenChuchi.LineaFra.application.LineasFraService;

import com.example.ExamenChuchi.LineaFra.domain.LineasFra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerLineasFra {

    @Autowired
    LineasFraService lineasFraService;

    @PostMapping("/lineas/add")
    public void createLineas(@RequestBody LineasFra lineasFra) {
        lineasFraService.createLineasFra(lineasFra);
    }
}
