package com.everis.equipo1examen3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo1examen3.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
