package com.poli.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false,length = 50)
	private String nombre;
	
	@Column(name = "precio", nullable = false,length = 50)
	private int precio;
	
	@Column(name = "cantidad", nullable = false,length = 50)
	private int cantidad;
	
	@Column(name = "precioTotal", nullable = false,length = 50)
	private int precioTotal;
	
	public Producto() {
		
	}

	public Producto(Long id, String nombre, int precio, int cantidad, int precioTotal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.precioTotal = precioTotal;
	}
	
	public Producto(String nombre, int precio, int cantidad, int precioTotal) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.precioTotal = precioTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecioTotal() {
		return precioTotal = precio * cantidad;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad
				+ ", precioTotal=" + precioTotal + "]";
	}
	

}
