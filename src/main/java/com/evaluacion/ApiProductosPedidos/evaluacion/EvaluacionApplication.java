package com.evaluacion.ApiProductosPedidos.evaluacion;

import com.evaluacion.ApiProductosPedidos.evaluacion.entity.Pedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.repository.PedidoRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EvaluacionApplication implements CommandLineRunner {
	private final Log LOGGER = LogFactory.getLog(EvaluacionApplication.class);
	private PedidoRepository pedidoRepository;

	public EvaluacionApplication(PedidoRepository pedidoRepository){
		this.pedidoRepository=pedidoRepository;

	}

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		savePedidoInDataBase();


	}
	private void savePedidoInDataBase(){
		Pedido pedido1 = new Pedido("nombrepedido1");
		Pedido pedido2 = new Pedido("nombrepedido2");
		Pedido pedido3 = new Pedido("nombrepedido3");
		Pedido pedido4 = new Pedido("nombrepedido4");
		Pedido pedido5 = new Pedido("nombrepedido5");
		List<Pedido> list = Arrays.asList(pedido1,pedido2,pedido3,pedido4,pedido5);
		pedidoRepository.saveAll(list);


	}

}
