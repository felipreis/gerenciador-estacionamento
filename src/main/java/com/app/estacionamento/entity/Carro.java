package com.app.estacionamento.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_carro")
@JsonIgnoreProperties({"hibernanteLazyInitializer","handler"})
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String marca;

    private String placa;

    @OneToMany(mappedBy = "carro", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Entrada> entradas = new ArrayList<>();


}
