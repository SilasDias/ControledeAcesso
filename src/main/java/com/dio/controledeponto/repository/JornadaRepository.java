package com.dio.controledeponto.repository;

import com.dio.controledeponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
