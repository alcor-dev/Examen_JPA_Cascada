package com.example.ExamenChuchi.Cliente.infrastructure.controller;

import com.example.ExamenChuchi.Cliente.application.ClienteServiceImpl;
import com.example.ExamenChuchi.Cliente.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControllerCliente {

    @Autowired
    ClienteServiceImpl clienteService;

    @GetMapping("/cliente/{idCLiente}")
    public Cliente readCliente(@PathVariable("idCliente") String idCliente) throws Exception {
        return clienteService.readCliente(idCliente);
    }

    @PostMapping("/cliente/add")
    public void addCliente(@RequestBody Cliente cliente) {
        clienteService.createCliente(cliente);
    }
}
