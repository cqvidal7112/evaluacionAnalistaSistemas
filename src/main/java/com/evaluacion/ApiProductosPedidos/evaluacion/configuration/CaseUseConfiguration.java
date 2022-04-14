package com.evaluacion.ApiProductosPedidos.evaluacion.configuration;

import com.evaluacion.ApiProductosPedidos.evaluacion.caseuse.GetPedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.caseuse.GetPedidoImplement;
import com.evaluacion.ApiProductosPedidos.evaluacion.service.PedidoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CaseUseConfiguration {
    @Bean
    GetPedido getUser(PedidoService pedidoService){
        return new GetPedidoImplement(pedidoService);

    }
}
