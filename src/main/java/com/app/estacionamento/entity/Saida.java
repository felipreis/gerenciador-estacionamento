package com.app.estacionamento.entity;

import java.time.LocalDateTime;

public class Saida {

    private int id;

    private Entrada entrada;

    private LocalDateTime horaSaida = LocalDateTime.now();

    private Double valor;

    private String formaPagamento;

}
