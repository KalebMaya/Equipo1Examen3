package com.everis.equipo1examen3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo1examen3.model.Producto;

@Repository
public interface ProductosRepository extends JpaRepository<Producto, Integer> {

}
