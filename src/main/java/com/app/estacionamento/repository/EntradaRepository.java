package com.app.estacionamento.repository;

import com.app.estacionamento.entity.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {
}
