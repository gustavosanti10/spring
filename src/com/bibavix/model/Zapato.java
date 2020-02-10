package com.bibavix.model;

public class Zapato {

	private long id;
	private String marca;
	private String color;
	private String tipo;
	private int talla;
	
	
	public Zapato() {
		
	}


	public Zapato(long id, String marca, String color, String tipo, int talla) {
		super();
		this.id = id;
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
		this.talla = talla;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getTalla() {
		return talla;
	}


	public void setTalla(int talla) {
		this.talla = talla;
	}
	
	
}
