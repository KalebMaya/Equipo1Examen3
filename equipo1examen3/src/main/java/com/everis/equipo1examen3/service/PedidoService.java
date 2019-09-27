package com.everis.equipo1examen3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo1examen3.model.Pedido;
import com.everis.equipo1examen3.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<Pedido> listar(){
		return pedidoRepository.findAll();
	}
	
	public Pedido insertar(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

}
