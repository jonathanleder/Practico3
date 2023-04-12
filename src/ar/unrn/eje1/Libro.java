package ar.unrn.eje1;

import java.util.Objects;

public abstract class Libro {

	double monto;
	String nombre;
	int codigoPrecio;

	public Libro(String nombre, int priceCode) {
		this.nombre = Objects.requireNonNull(nombre);
		this.codigoPrecio = Objects.requireNonNull(priceCode);
		this.monto = 0;
	}

	public int codigoPrecio() {
		return codigoPrecio;
	}

	public abstract double calcularMonto(int diasAlquilados);

	public String nombre() {
		return nombre;
	}
}