package ar.unrn.eje3;

public class Desayuno extends Gasto {
	private static int EXCESO_DESAYUNO = 1000;

	public Desayuno(TipoDeGasto tipo, int monto) {
		super(tipo, monto);
	}

	@Override
	public int monto() {
		return this.monto;
	}

	@Override
	String excesoComida() {
		if (this.esComida() && this.monto() > EXCESO_DESAYUNO)
			return "X";
		return "";
	}

}
