package com.evaluacion.ApiProductosPedidos.evaluacion.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pedido", nullable = false, unique = true)
    private Long id;

    @Column(length = 50)
    private String nombre;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedido_project",
    joinColumns = {@JoinColumn(name="pedido_id")},
    inverseJoinColumns = {@JoinColumn(name="producto_id")})
    @JsonManagedReference
    private List<Producto> productos =new ArrayList<Producto>();

    public Pedido() {
    }


    public Pedido(String nombre) {
        this.nombre = nombre;
    }

    public Pedido(Long id){
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", productos=" + productos +
                '}';
    }
}
