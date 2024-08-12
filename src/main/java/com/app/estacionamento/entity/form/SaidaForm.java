package com.app.estacionamento.entity.form;

import com.app.estacionamento.entity.Entrada;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaidaForm {

    private Integer entradaId;

    private String formaPagamento;
}
