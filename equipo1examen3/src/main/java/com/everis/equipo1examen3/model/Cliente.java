package com.everis.equipo1examen3.model;
// Generated 27/09/2019 12:48:57 PM by Hibernate Tools 5.2.12.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "microservicio1")
public class Cliente implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private double latitud;
	private double longitud;
//	@JsonIgnore
//	private Set<Pedido> pedidos = new HashSet<Pedido>(0);

	public Cliente() {
	}

	public Cliente(String nombre, double latitud, double longitud) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
	}

//	public Cliente(String nombre, double latitud, double longitud, Set<Pedido> pedidos) {
//		this.nombre = nombre;
//		this.latitud = latitud;
//		this.longitud = longitud;
//		this.pedidos = pedidos;
//	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "latitud", nullable = false, precision = 22, scale = 0)
	public double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	@Column(name = "longitud", nullable = false, precision = 22, scale = 0)
	public double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente")
//	public Set<Pedido> getPedidos() {
//		return this.pedidos;
//	}
//
//	public void setPedidos(Set<Pedido> pedidos) {
//		this.pedidos = pedidos;
//	}

}
