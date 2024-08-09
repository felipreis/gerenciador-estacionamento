package com.app.estacionamento.service;

import com.app.estacionamento.entity.form.EntradaForm;
import com.app.estacionamento.entity.Entrada;

public interface IEntradaService {

    Entrada create(EntradaForm form);

    Entrada get(int id);


}
