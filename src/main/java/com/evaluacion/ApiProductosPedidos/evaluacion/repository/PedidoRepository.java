package com.evaluacion.ApiProductosPedidos.evaluacion.repository;

import com.evaluacion.ApiProductosPedidos.evaluacion.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
