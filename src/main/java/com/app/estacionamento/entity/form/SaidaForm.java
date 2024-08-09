package com.app.estacionamento.entity.form;

import com.app.estacionamento.entity.Entrada;

import java.time.LocalDateTime;

public class SaidaForm {

    private Entrada entrada;

    private LocalDateTime horaSaida = LocalDateTime.now();

    private Double valor;

    private String formaPagamento;
}
