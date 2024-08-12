package com.app.estacionamento.service.impl;

import com.app.estacionamento.entity.Entrada;
import com.app.estacionamento.entity.Saida;
import com.app.estacionamento.entity.form.SaidaForm;
import com.app.estacionamento.repository.EntradaRepository;
import com.app.estacionamento.repository.SaidaRepository;
import com.app.estacionamento.service.ISaidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaidaService implements ISaidaService {

    @Autowired
    private SaidaRepository saidaRepository;

    @Autowired
    private EntradaRepository entradaRepository;

    @Override
    public Saida create(SaidaForm form) {
        Saida saida = new Saida();
        Entrada entrada = entradaRepository.findById(form.getEntradaId()).get();
        saida.setEntrada(entrada);
        saida.setFormaPagamento(form.getFormaPagamento());
        saida.setValor(form.getValor());
        return saidaRepository.save(saida);
    }

    @Override
    public Saida get(Integer id) {
        return saidaRepository.findById(id).get();
    }

    @Override
    public List<Saida> list() {
        return saidaRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        saidaRepository.deleteById(id);
    }
}
