package com.app.estacionamento.service;

import com.app.estacionamento.entity.form.SaidaForm;
import com.app.estacionamento.entity.Saida;

import java.util.List;

public interface ISaidaService {

    Saida create(SaidaForm form);

    Saida get(Integer id);

    List<Saida> list();

    void delete(Integer id);

}
