package com.everis.equipo1examen3.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo1examen3.model.Pedido;
import com.everis.equipo1examen3.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/")
	public List<Pedido> listar(){
		return  pedidoService.listar();
	}
	
	@PostMapping("/")
	public Pedido insertar(@RequestBody Pedido pedido) {
		pedido.setFecharegistro(new Date());
		pedido.setFechaentrega(new Date());
		return pedidoService.insertar(pedido);
	}

}
