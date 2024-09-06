package com.app.estacionamento.controller;

import com.app.estacionamento.service.impl.SaidaService;
import com.app.estacionamento.entity.Saida;
import com.app.estacionamento.entity.form.SaidaForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saida")
public class SaidaController {

    @Autowired
    private SaidaService saidaService;

    @PostMapping
    public Saida create(@RequestBody SaidaForm form){
        return saidaService.create(form);
    }

    @GetMapping
    public List<Saida> getAll(){
        return saidaService.list();
    }

    @GetMapping("/{id}")
    public Saida get(@PathVariable Integer id){
        return saidaService.get(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
         saidaService.delete(id);
    }

    @GetMapping("/carro/placa/{placa}")
    public List<Saida> buscarPorPlacaDoCarro(@PathVariable String placa) {
        return saidaService.findSaidaByPlaca(placa);
    }
}
