package ar.unrn.eje3;

public class Gasto {

	private TipoDeGasto tipoGasto;
	private int monto;

	public Gasto(TipoDeGasto tipo, int monto) {
		this.tipoGasto = tipo;
		this.monto = monto;
	}

	public TipoDeGasto tipoGasto() {
		return tipoGasto;
	}

	public int monto() {
		return monto;
	}
}
