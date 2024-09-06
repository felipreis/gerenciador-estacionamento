package com.app.estacionamento.service.impl;

import com.app.estacionamento.entity.Carro;
import com.app.estacionamento.entity.Entrada;
import com.app.estacionamento.entity.form.EntradaForm;
import com.app.estacionamento.repository.CarroRepository;
import com.app.estacionamento.repository.EntradaRepository;
import com.app.estacionamento.service.IEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntradaService implements IEntradaService {

    @Autowired
    private EntradaRepository entradaRepository;

    @Autowired
    private CarroRepository carroRepository;

    @Override
    public Entrada create(EntradaForm form) {
        Entrada entrada = new Entrada();
        Carro carro = carroRepository.findById(form.getCarroId()).get();
        entrada.setCarro(carro);
        return entradaRepository.save(entrada);
    }

    @Override
    public List<Entrada> getAll() {
        return entradaRepository.findAll();
    }

    @Override
    public List<Entrada> findByPlacaCarro(String placa) {
        return entradaRepository.findByCarroPlaca(placa);
    }


}
