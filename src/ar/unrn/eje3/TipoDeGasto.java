package ar.unrn.eje3;

import java.util.Objects;

public enum TipoDeGasto {
	CENA("Cena"), DESAYUNO("Desayuno"), ALQUILER_AUTO("Alquiler_auto");

	private String tipoGasto;

	private TipoDeGasto(String tipo) {
		this.tipoGasto = Objects.requireNonNull(tipo);
	}

}
