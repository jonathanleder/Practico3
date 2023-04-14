package ar.unrn.eje2;

import java.util.Objects;

public enum Filtro {

	COMPANIA("company_name", 1), CIUDAD("city", 4), ESTADO("state", 5), ENTORNO("round", 9);

	private String nombre;
	private Integer valor;

	private Filtro(String nombre, Integer valor) {
		this.nombre = Objects.requireNonNull(nombre);
		this.valor = Objects.requireNonNull(valor);
	}

	Integer obtenerValor() {
		return this.valor;
	}

	String obtenerNombre() {
		return this.nombre;
	}
}