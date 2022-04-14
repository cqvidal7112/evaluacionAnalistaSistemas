package com.evaluacion.ApiProductosPedidos.evaluacion.caseuse;

import com.evaluacion.ApiProductosPedidos.evaluacion.entity.Pedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.service.PedidoService;
import org.springframework.stereotype.Component;

@Component
public class CreatePedido {
    private PedidoService pedidoService;
    public CreatePedido(PedidoService pedidoService){
        this.pedidoService=pedidoService;
    }

    public Pedido save(Pedido newPedido){
        return pedidoService.save(newPedido);
    }

}
