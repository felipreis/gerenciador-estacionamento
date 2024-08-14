package com.app.estacionamento.view.swingapp;

import com.app.estacionamento.GerenciadorEstacionamentoApplication;
import com.app.estacionamento.view.EntradaVeiculo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

public class SwingApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Inicialize o contexto do Spring para obter beans se necessário
            ConfigurableApplicationContext context = SpringApplication.run(GerenciadorEstacionamentoApplication.class, args);

            // Crie a instância da GUI
            EntradaVeiculo frame = context.getBean(EntradaVeiculo.class);
            frame.setVisible(true);
        });
    }
}
