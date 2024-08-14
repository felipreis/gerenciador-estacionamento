package com.app.estacionamento.view;

import com.app.estacionamento.controller.EntradaController;
import com.app.estacionamento.entity.Carro;
import com.app.estacionamento.entity.Entrada;
import com.app.estacionamento.entity.form.CarroForm;
import com.app.estacionamento.entity.form.EntradaForm;
import com.app.estacionamento.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.app.estacionamento.controller.CarrroController;

public class EntradaVeiculo {

    private JTextField marca;
    private JButton entradaButton;
    private JTextField placa;

    public EntradaVeiculo() {
        entradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CarroForm carroForm = new CarroForm();
                Carro carro = new Carro();
                CarrroController carroController =  new CarrroController();
                EntradaForm entradaForm = new EntradaForm();
                EntradaController entradaController = new EntradaController();

                carroForm.setMarca(marca.getText());
                carroForm.setPlaca(placa.getText());

                carro = carroController.create(carroForm);

                entradaForm.setCarroId(carro.getId());

                entradaController.create(entradaForm);

                System.out.println("entrada do veiculo realizada");



            }
        });
    }
}
