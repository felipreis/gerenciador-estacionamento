package com.app.estacionamento.service.impl;


import com.app.estacionamento.entity.Carro;
import com.app.estacionamento.entity.form.CarroForm;
import com.app.estacionamento.repository.CarroRepository;
import com.app.estacionamento.service.ICarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService implements ICarroService {

    @Autowired
    private CarroRepository repository;

    @Override
    public Carro create(CarroForm form) {
        Carro carro = new Carro();
        carro.setMarca(form.getMarca());
        carro.setPlaca(form.getPlaca());
        return repository.save(carro);
    }

    @Override
    public Carro get(Integer id) {
        return null;
    }

    @Override
    public List<Carro> getAll() {
       return repository.findAll();

    }

    @Override
    public void delete(Integer id) {

    }
}
