package com.app.estacionamento.service;

import com.app.estacionamento.entity.form.EntradaForm;
import com.app.estacionamento.entity.Entrada;

import java.util.List;

public interface IEntradaService {

    Entrada create(EntradaForm form);

    List<Entrada> getAll();

    List<Entrada> findByPlacaCarro(String placa);

}
