package com.app.estacionamento.entity;

import com.app.estacionamento.timeutils.TimeUtils;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_saida")
public class Saida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "entrada_id")
    private Entrada entrada;

    private LocalDateTime horaSaida = LocalDateTime.now();

    private Double valor;

    private String formaPagamento;

    @PostLoad
    private void initialize() {
        if (entrada != null && horaSaida != null) {
            this.valor = TimeUtils.valorPagamento(entrada.getHoraEntrada(), this.horaSaida);
        }
    }
}
