package com.example.ExamenChuchi.CabeceraFra.infrastructure.repository;

import com.example.ExamenChuchi.CabeceraFra.domain.CabeceraFra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabeceraFraRepository extends JpaRepository<CabeceraFra, String> {
}
