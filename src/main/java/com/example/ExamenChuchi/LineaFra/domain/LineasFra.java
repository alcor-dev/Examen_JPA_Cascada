package com.example.ExamenChuchi.LineaFra.domain;

import com.example.ExamenChuchi.CabeceraFra.domain.CabeceraFra;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "LineasFra")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LineasFra implements Serializable {

    @Id
    @GeneratedValue //(strategy = GenerationType.SEQUENCE)
    private int id_Fra;

    @Column
    private String proNomb;

    @Column
    private double cantidad;

    @Column
    private double precio;
}
