package com.example.ExamenChuchi.CabeceraFra.domain;

import com.example.ExamenChuchi.Cliente.domain.Cliente;
import com.example.ExamenChuchi.LineaFra.domain.LineasFra;
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
@Table(name = "CabeceraFra")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CabeceraFra implements Serializable {

    @Id
    @GeneratedValue // (strategy = GenerationType.SEQUENCE)
    private int cli_codi;

    @Column
    private double importeFra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Cliente")
    private Cliente cliente;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn( name = "lineas")
    private List<LineasFra> lineasFra;// = new ArrayList<>();
}
