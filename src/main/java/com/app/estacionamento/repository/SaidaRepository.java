package com.app.estacionamento.repository;

import com.app.estacionamento.entity.Saida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaidaRepository extends JpaRepository<Saida,Integer> {
}
