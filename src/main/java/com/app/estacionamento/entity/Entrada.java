package com.app.estacionamento.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entrada {

    private int id;

    private Carro carro;

    private LocalDate dataEntrada = LocalDate.now();

    private LocalDateTime horaEntrada = LocalDateTime.now();

}
