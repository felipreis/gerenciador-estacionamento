package com.app.estacionamento.entity.form;

import com.app.estacionamento.entity.Carro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntradaForm {

    private int carroId;

}
