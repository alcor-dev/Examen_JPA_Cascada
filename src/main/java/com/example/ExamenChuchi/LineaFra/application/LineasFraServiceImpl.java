package com.example.ExamenChuchi.LineaFra.application;

import com.example.ExamenChuchi.LineaFra.domain.LineasFra;
import com.example.ExamenChuchi.LineaFra.infrastructure.repository.LineasFraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineasFraServiceImpl implements LineasFraService{

    @Autowired
    LineasFraRepository lineasFraRepository;

    @Override
    public void createLineasFra(LineasFra lineasFra) {
        lineasFraRepository.save(lineasFra);
        System.out.println("Introducida línea nueva con datos: " + lineasFra.toString());
    }

    @Override
    public void readLineasFraById(String id) {
        lineasFraRepository.findById(id);
    }

    @Override
    public void modifyLineasFra(LineasFra lineasFra) {
        lineasFraRepository.save(lineasFra);
    }

    @Override
    public void deleteLineasFraById(String id) {
        lineasFraRepository.deleteById(id);
    }
}
