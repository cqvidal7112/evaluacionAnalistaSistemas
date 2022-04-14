package com.evaluacion.ApiProductosPedidos.evaluacion.service;

import com.evaluacion.ApiProductosPedidos.evaluacion.entity.Pedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.repository.PedidoRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PedidoService {
    private final Log LOG = LogFactory.getLog(PedidoService.class);
    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }
    @Transactional
    public void saveTransactional(List<Pedido> pedidos){
        pedidos.stream()
                .peek(user -> LOG.info("Registro Insertado "+pedidos))
                .forEach(pedidoRepository::save);

    }

    public List<Pedido> getAllPedidos(){
        return pedidoRepository.findAll();
    }

    public Pedido save(Pedido newPedido) {
        return pedidoRepository.save(newPedido);
    }

    public void delete(Long id) {
        pedidoRepository.delete(new Pedido(id));
    }

    public Pedido update(Pedido newPedido, Long id) {

        return

        pedidoRepository.findById(id)
                .map(
                pedido -> {
                    pedido.setNombre(newPedido.getNombre());
                    return  pedidoRepository.save(pedido);
                }
        ).get();
    }
}
