package com.evaluacion.ApiProductosPedidos.evaluacion.caseuse;

import com.evaluacion.ApiProductosPedidos.evaluacion.entity.Pedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.service.PedidoService;

import java.util.List;

public class GetPedidoImplement implements GetPedido{
    private PedidoService pedidoService;

    public GetPedidoImplement(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @Override
    public List<Pedido> getAll() {
        return pedidoService.getAllPedidos();
    }

}
