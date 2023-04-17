package ar.unrn.eje3;

import java.time.LocalDate;

public class FechaFake implements ProveedorFecha {

	LocalDate fecha;

	public FechaFake() {
		fecha = LocalDate.of(2023, 4, 16);
	}

	@Override
	public String fecha() {
		return fecha.toString();
	}

}
