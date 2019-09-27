package com.everis.equipo1examen3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo1examen3.model.Productosdelpedido;
import com.everis.equipo1examen3.repository.ProductosdelpedidoRepository;

@Service
public class ProductosdelpedidoService {
	
	@Autowired
	 private ProductosdelpedidoRepository productosdelpedidoRepository;
	
	public Productosdelpedido insertar(Productosdelpedido productosdelpedido) {
		return productosdelpedidoRepository.save(productosdelpedido);
	}

}
