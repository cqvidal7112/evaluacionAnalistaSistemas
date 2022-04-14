package com.evaluacion.ApiProductosPedidos.evaluacion.caseuse;

import com.evaluacion.ApiProductosPedidos.evaluacion.entity.Pedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UpdatePedido {
    private PedidoService pedidoService;
    public UpdatePedido(PedidoService pedidoService){
        this.pedidoService=pedidoService;
    }

    public Pedido update(Pedido newPedido, Long id) {
        return pedidoService.update(newPedido,id);
    }
}
