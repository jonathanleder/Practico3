package ar.unrn.eje3;

public abstract class Gasto {

	TipoDeGasto tipoGasto;
	int monto;

	public Gasto(TipoDeGasto tipo, int monto) {
		this.tipoGasto = tipo;
		this.monto = monto;
	}

	public String nombre() {
		return this.tipoGasto.toString();
	}

	public TipoDeGasto tipoGasto() {
		return tipoGasto;
	}

	boolean esComida() {
		return this.tipoGasto == TipoDeGasto.CENA || this.tipoGasto == TipoDeGasto.DESAYUNO;
	}

	abstract String excesoComida();

	public abstract int monto();
}
