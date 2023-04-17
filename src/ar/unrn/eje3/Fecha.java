package ar.unrn.eje3;

import java.time.LocalDate;

public class Fecha implements ProveedorFecha {

	LocalDate fecha;

	public Fecha() {
		this.fecha = LocalDate.now();
	}

	@Override
	public String fecha() {
		return fecha.toString();
	}

}
