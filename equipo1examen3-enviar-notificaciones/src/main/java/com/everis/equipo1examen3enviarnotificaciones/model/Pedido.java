package com.everis.equipo1examen3enviarnotificaciones.model;
// Generated 27/09/2019 12:48:57 PM by Hibernate Tools 5.2.12.Final

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements java.io.Serializable {

	private Integer id;
	private Cliente cliente;
	private Date fecharegistro;
	private Date fechaentrega;
	private List<Productosdelpedido> productosdelpedidos = new ArrayList<Productosdelpedido>(0);

	public Pedido() {
	}

	public Pedido(Cliente cliente, Date fecharegistro, Date fechaentrega) {
		this.cliente = cliente;
		this.fecharegistro = fecharegistro;
		this.fechaentrega = fechaentrega;
	}

	public Pedido(Cliente cliente, Date fecharegistro, Date fechaentrega, List<Productosdelpedido> productosdelpedidos) {
		this.cliente = cliente;
		this.fecharegistro = fecharegistro;
		this.fechaentrega = fechaentrega;
		this.productosdelpedidos = productosdelpedidos;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public Date getFechaentrega() {
		return this.fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	public List<Productosdelpedido> getProductosdelpedidos() {
		return this.productosdelpedidos;
	}

	public void setProductosdelpedidos(List<Productosdelpedido> productosdelpedidos) {
		this.productosdelpedidos = productosdelpedidos;
	}

}
