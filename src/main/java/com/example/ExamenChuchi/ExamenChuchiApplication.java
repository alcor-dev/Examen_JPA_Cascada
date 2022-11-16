package com.example.ExamenChuchi;

import com.example.ExamenChuchi.Cliente.domain.Cliente;
import com.example.ExamenChuchi.Cliente.infrastructure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamenChuchiApplication {

	@Autowired
	ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamenChuchiApplication.class, args);
	}

	@Bean
	CommandLineRunner start()
	{
		return  p ->
		{
		    Cliente cl= new Cliente();
			cl.setNombre("");
			clienteRepository.save(cl);
		};
	}
}
