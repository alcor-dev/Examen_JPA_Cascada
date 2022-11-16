package com.example.ExamenChuchi.Cliente.infrastructure.repository;

import com.example.ExamenChuchi.Cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
