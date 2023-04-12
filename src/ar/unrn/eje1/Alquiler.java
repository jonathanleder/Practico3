package ar.unrn.eje1;

import java.util.Objects;

public class Alquiler {
	public static final int MAS_DE_UN_DIA = 1;
	private CopiaLibro copia;
	private int diasAlquilados;

	public Alquiler(CopiaLibro copia, int diasAlquilados) {
		Objects.requireNonNull(diasAlquilados);

		this.copia = copia;
		this.diasAlquilados = diasAlquilados;
	}

	public Double calcularMonto() {
		return copia.calcularMonto(diasAlquilados);
	}

	public boolean esLibroNuevo() {
		return this.copia().libro().codigoPrecio() == LibroNuevo.NUEVO_LANZAMIENTO;
	}

	public int diasAlquilados() {
		return this.diasAlquilados;
	}

	public CopiaLibro copia() {
		return this.copia;
	}

	public Integer sumarPuntos() {
		Integer puntosAlquilerFrecuente = 0;
		puntosAlquilerFrecuente++;
		if ((esLibroNuevo()) && diasAlquilados() > MAS_DE_UN_DIA) {
			puntosAlquilerFrecuente++;
		}
		return puntosAlquilerFrecuente;
	}
}
