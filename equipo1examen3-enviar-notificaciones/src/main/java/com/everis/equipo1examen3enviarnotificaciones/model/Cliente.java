package com.everis.equipo1examen3enviarnotificaciones.model;
// Generated 27/09/2019 12:48:57 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Cliente implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private double latitud;
	private double longitud;
	private Set<Pedido> pedidos = new HashSet<Pedido>(0);

	public Cliente() {
	}

	public Cliente(String nombre, double latitud, double longitud) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Cliente(String nombre, double latitud, double longitud, Set<Pedido> pedidos) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.pedidos = pedidos;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
