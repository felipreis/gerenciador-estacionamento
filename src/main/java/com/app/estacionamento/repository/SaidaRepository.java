package com.app.estacionamento.repository;

import com.app.estacionamento.entity.Saida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaidaRepository extends JpaRepository<Saida,Integer> {

    @Query("SELECT s FROM Saida s WHERE s.entrada.carro.placa = :placa")
    List<Saida> findByCarroPlaca(@Param("placa") String placa);
}
