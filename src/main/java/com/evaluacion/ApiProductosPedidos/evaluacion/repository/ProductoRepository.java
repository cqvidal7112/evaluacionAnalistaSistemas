package com.evaluacion.ApiProductosPedidos.evaluacion.repository;

import com.evaluacion.ApiProductosPedidos.evaluacion.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
