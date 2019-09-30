package com.everis.equipo1examen3enviarnotificaciones.model;
// Generated 27/09/2019 12:48:57 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Producto implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String precio;
	private String url;

	public Producto() {
	}

	public Producto(String nombre, String precio, String url) {
		this.nombre = nombre;
		this.precio = precio;
		this.url = url;
	}

	public Producto(String nombre, String precio, String url, Set<Productosdelpedido> productosdelpedidos) {
		this.nombre = nombre;
		this.precio = precio;
		this.url = url;
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

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
