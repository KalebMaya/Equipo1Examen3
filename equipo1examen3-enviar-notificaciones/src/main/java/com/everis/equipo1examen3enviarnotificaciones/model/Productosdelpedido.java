package com.everis.equipo1examen3enviarnotificaciones.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

// Generated 27/09/2019 12:48:57 PM by Hibernate Tools 5.2.12.Final

public class Productosdelpedido implements java.io.Serializable {

	private Integer id;
	@JsonIgnore
	private Pedido pedido;
	private Producto producto;

	public Productosdelpedido() {
	}

	public Productosdelpedido(Pedido pedido, Producto producto) {
		this.pedido = pedido;
		this.producto = producto;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
