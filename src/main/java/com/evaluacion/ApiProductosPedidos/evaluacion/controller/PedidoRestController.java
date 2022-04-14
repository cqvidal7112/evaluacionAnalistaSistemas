package com.evaluacion.ApiProductosPedidos.evaluacion.controller;

import com.evaluacion.ApiProductosPedidos.evaluacion.caseuse.CreatePedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.caseuse.DeletePedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.caseuse.GetPedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.caseuse.UpdatePedido;
import com.evaluacion.ApiProductosPedidos.evaluacion.entity.Pedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Pedidos")
public class PedidoRestController {

    private GetPedido getPedido;
    private CreatePedido createPedido;
    private DeletePedido deletePedido;
    private UpdatePedido updatePedido;

    public PedidoRestController(GetPedido getPedido,CreatePedido createPedido, DeletePedido deletePedido, UpdatePedido updatePedido) {

        this.getPedido = getPedido;
        this.createPedido= createPedido;
        this.deletePedido= deletePedido;
        this.updatePedido= updatePedido;
    }

    @GetMapping("/")
    List<Pedido> get(){
        return getPedido.getAll();

    }

    @PostMapping("/")
    ResponseEntity<Pedido> newPedido(@RequestBody Pedido newPedido){
        return new ResponseEntity<>(createPedido.save(newPedido), HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    ResponseEntity deletePedido(@PathVariable Long id){
        deletePedido.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    ResponseEntity<Pedido> replacePedido(@RequestBody Pedido newPedido, @PathVariable Long id){
        return new ResponseEntity<>(updatePedido.update(newPedido,id), HttpStatus.OK);


    }

}
