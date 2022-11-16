package com.example.ExamenChuchi.CabeceraFra.application;

import com.example.ExamenChuchi.CabeceraFra.domain.CabeceraFra;
import com.example.ExamenChuchi.CabeceraFra.infrastructure.repository.CabeceraFraRepository;
import com.example.ExamenChuchi.Cliente.domain.Cliente;
import com.example.ExamenChuchi.Cliente.infrastructure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabeceraFraServiceImpl implements CabeceraFraService{

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    CabeceraFraRepository cabeceraFraRepository;

    @Override
    public void createCabeceraFra(CabeceraFra cabeceraFra) throws Exception {
        Cliente cliente= clienteRepository.findById(cabeceraFra.getCliente().getId_Cliente()).orElseThrow(Exception::new);
        cabeceraFra.setCliente(cliente);
        cabeceraFraRepository.save(cabeceraFra);
        System.out.println("Añadido la cabecera: " + cabeceraFra.getCli_codi() + "con importe " + cabeceraFra.getImporteFra());
    }

    @Override
    public CabeceraFra readCabeceraFraById(String id) {

        return null;
    }

    @Override
    public void modifyCabeceraFra(CabeceraFra cabeceraFra) {
        cabeceraFraRepository.save(cabeceraFra);
        System.out.println("Modificada la cabecera: " + cabeceraFra.getCli_codi() + "con importe " + cabeceraFra.getImporteFra());
    }

    @Override
    public void deleteCabeceraFraById(String id) {
        cabeceraFraRepository.deleteById(id);
        System.out.println("Eliminada la cabecera de id: " + id);
    }
}
