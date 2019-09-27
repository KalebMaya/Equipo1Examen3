package com.everis.equipo1examen3.model;
// Generated 27/09/2019 12:48:57 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Pedido generated by hbm2java
 */
@Entity
@Table(name = "pedido", catalog = "microservicio1")
public class Pedido implements java.io.Serializable {

	private Integer id;
	private Cliente cliente;
	private Date fecharegistro;
	private Date fechaentrega;
	@JsonIgnore
	private Set<Productosdelpedido> productosdelpedidos = new HashSet<Productosdelpedido>(0);

	public Pedido() {
	}

	public Pedido(Cliente cliente, Date fecharegistro, Date fechaentrega) {
		this.cliente = cliente;
		this.fecharegistro = fecharegistro;
		this.fechaentrega = fechaentrega;
	}

	public Pedido(Cliente cliente, Date fecharegistro, Date fechaentrega, Set<Productosdelpedido> productosdelpedidos) {
		this.cliente = cliente;
		this.fecharegistro = fecharegistro;
		this.fechaentrega = fechaentrega;
		this.productosdelpedidos = productosdelpedidos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecharegistro", nullable = false, length = 19)
	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaentrega", nullable = false, length = 19)
	public Date getFechaentrega() {
		return this.fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido")
	public Set<Productosdelpedido> getProductosdelpedidos() {
		return this.productosdelpedidos;
	}

	public void setProductosdelpedidos(Set<Productosdelpedido> productosdelpedidos) {
		this.productosdelpedidos = productosdelpedidos;
	}

}
