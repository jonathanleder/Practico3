package ar.unrn.eje1;

import java.util.Objects;

public class Recibo {
	private Double total;
	private Integer puntosObtenidos;

	public Recibo(Double total, Integer puntosObtenidos) {
		this.total = Objects.requireNonNull(total);
		this.puntosObtenidos = Objects.requireNonNull(puntosObtenidos);
	}

	public Double montoTotal() {
		return total;
	}

	public Integer puntosObtenidos() {
		return puntosObtenidos;
	}

}
