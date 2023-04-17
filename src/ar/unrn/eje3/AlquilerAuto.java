package ar.unrn.eje3;

public class AlquilerAuto extends Gasto {

	public AlquilerAuto(TipoDeGasto tipo, int monto) {
		super(tipo, monto);
	}

	@Override
	public int monto() {
		return this.monto;
	}

	@Override
	String excesoComida() {
		return "";
	}

}
