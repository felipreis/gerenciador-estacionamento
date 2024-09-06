package com.app.estacionamento.repository;

import com.app.estacionamento.entity.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {

    @Query("SELECT e FROM Entrada e WHERE e.carro.placa = :placa")
    List<Entrada> findByCarroPlaca(@Param("placa") String placa);
}
