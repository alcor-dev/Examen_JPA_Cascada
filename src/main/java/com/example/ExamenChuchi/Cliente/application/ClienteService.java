package com.example.ExamenChuchi.Cliente.application;

import com.example.ExamenChuchi.Cliente.domain.Cliente;

public interface ClienteService {

    void createCliente(Cliente cliente);
    Cliente readCliente(String id) throws Exception;
    void modifyCliente(Cliente cliente) throws Exception;
    void deleteCliente(String id) throws Exception;
}
