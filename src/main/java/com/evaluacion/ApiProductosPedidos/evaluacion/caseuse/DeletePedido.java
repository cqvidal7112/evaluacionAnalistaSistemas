package com.evaluacion.ApiProductosPedidos.evaluacion.caseuse;

import com.evaluacion.ApiProductosPedidos.evaluacion.service.PedidoService;
import org.springframework.stereotype.Component;

@Component
public class DeletePedido {
    private PedidoService pedidoService;
    public DeletePedido(PedidoService pedidoService){
        this.pedidoService=pedidoService;
    }

    public void remove(Long id) {
        pedidoService.delete(id);
    }
}
