package com.app.estacionamento.controller;


import com.app.estacionamento.entity.Carro;
import com.app.estacionamento.entity.form.CarroForm;
import com.app.estacionamento.service.impl.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarrroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public List<Carro> getAll(){
        return carroService.getAll();
    }


    @GetMapping("/placa/{placa}")
    public Carro getPlaca(@PathVariable String placa){
        return carroService.getPlaca(placa);
    }


    @PostMapping
    public Carro create(@RequestBody CarroForm form){
        return carroService.create(form);
    }

}
