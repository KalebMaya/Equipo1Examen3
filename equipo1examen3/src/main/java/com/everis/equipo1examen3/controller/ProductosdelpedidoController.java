package com.everis.equipo1examen3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo1examen3.model.Productosdelpedido;
import com.everis.equipo1examen3.service.ProductosdelpedidoService;

@RestController
@RequestMapping("/productosdelpedido")
public class ProductosdelpedidoController {
	
	@Autowired
	private ProductosdelpedidoService productosdelpedidoService;
	
	@PostMapping("/")
	public Productosdelpedido insertar(@RequestBody Productosdelpedido productosdelpedido) {
		return productosdelpedidoService.insertar(productosdelpedido);
	}
	
	

}
