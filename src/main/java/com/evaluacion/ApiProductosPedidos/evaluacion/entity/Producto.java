package com.evaluacion.ApiProductosPedidos.evaluacion.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto", nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private LocalDate fecha;

    @Column(length = 200)
    private String descripcion;


    @ManyToOne
    @JsonBackReference
    private Pedido pedido;

}
