package com.app.estacionamento.service;

import com.app.estacionamento.entity.Carro;
import com.app.estacionamento.entity.form.CarroForm;

import java.util.List;

public interface ICarroService {

    Carro create(CarroForm form);

    Carro get(Integer id);

    List<Carro> getAll();

    void delete(Integer
                        id);
}
