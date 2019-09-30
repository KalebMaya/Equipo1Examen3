package com.everis.equipo1examen3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo1examen3.model.Productosdelpedido;
import com.everis.equipo1examen3.repository.ProductosRepository;
import com.everis.equipo1examen3.repository.ProductosdelpedidoRepository;

@Service
public class ProductosdelpedidoService {
	
	@Autowired
	 private ProductosdelpedidoRepository productosdelpedidoRepository;
	
	@Autowired
	private ProductosRepository productosrepositorio;
	
	public Productosdelpedido insertar(Productosdelpedido productosdelpedido) {
		
		productosdelpedido.setProducto(productosrepositorio.findById(productosdelpedido.getProducto().getId()).get());
		return productosdelpedidoRepository.save(productosdelpedido);
	}

}
