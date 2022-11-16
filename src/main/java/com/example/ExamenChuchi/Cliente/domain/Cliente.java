package com.example.ExamenChuchi.Cliente.domain;

import com.example.ExamenChuchi.CabeceraFra.domain.CabeceraFra;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Cliente;

    @Column
    private String nombre;
}
