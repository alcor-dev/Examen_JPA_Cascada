package com.example.ExamenChuchi.LineaFra.infrastructure.repository;

import com.example.ExamenChuchi.LineaFra.domain.LineasFra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineasFraRepository extends JpaRepository<LineasFra, String> {
}
