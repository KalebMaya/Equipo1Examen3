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
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto", catalog = "microservicio1")
public class Producto implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String precio;
	private String url;
//	//@JsonIgnore
//	private Set<Productosdelpedido> productosdelpedidos = new HashSet<Productosdelpedido>(0);

	public Producto() {
	}

	public Producto(String nombre, String precio, String url) {
		this.nombre = nombre;
		this.precio = precio;
		this.url = url;
	}

//	public Producto(String nombre, String precio, String url, Set<Productosdelpedido> productosdelpedidos) {
//		this.nombre = nombre;
//		this.precio = precio;
//		this.url = url;
//		this.productosdelpedidos = productosdelpedidos;
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

	@Column(name = "precio", nullable = false, length = 45)
	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Column(name = "url", nullable = false, length = 45)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
//
//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "producto")
//	public Set<Productosdelpedido> getProductosdelpedidos() {
//		return this.productosdelpedidos;
//	}
//
//	public void setProductosdelpedidos(Set<Productosdelpedido> productosdelpedidos) {
//		this.productosdelpedidos = productosdelpedidos;
//	}

}
