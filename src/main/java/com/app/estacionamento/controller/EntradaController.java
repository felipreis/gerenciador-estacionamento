package com.app.estacionamento.controller;


import com.app.estacionamento.entity.Entrada;
import com.app.estacionamento.entity.form.EntradaForm;
import com.app.estacionamento.service.impl.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrada")
public class EntradaController {

    @Autowired
    EntradaService entradaService;

    @PostMapping
    public Entrada create(@RequestBody EntradaForm form){
        return entradaService.create(form);
    }

    @GetMapping
    public List<Entrada> getAll(){
        return entradaService.getAll();
    }




}
