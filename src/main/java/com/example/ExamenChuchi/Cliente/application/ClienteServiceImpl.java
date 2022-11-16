package com.example.ExamenChuchi.Cliente.application;

import com.example.ExamenChuchi.Cliente.domain.Cliente;
import com.example.ExamenChuchi.Cliente.infrastructure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public void createCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        System.out.println("Guardado cliente: " + cliente.toString());
    }

    @Override
    public Cliente readCliente(String id) throws Exception {
        return clienteRepository.findById(Integer.parseInt(id)).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public void modifyCliente(Cliente cliente) throws Exception{
        clienteRepository.save(cliente);
        System.out.println("Cliente con la ID: " + cliente.getId_Cliente() + " ha sido actualizado");
    }

    @Override
    public void deleteCliente(String id) throws Exception {
        clienteRepository.deleteById(Integer.parseInt(id));

    }
}
