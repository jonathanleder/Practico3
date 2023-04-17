package ar.unrn.eje3;

public class Cena extends Gasto {
	private static int EXCESO_CENA = 5000;

	public Cena(TipoDeGasto tipo, int monto) {
		super(tipo, monto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int monto() {

		return this.monto;
	}

	@Override
	String excesoComida() {
		if (this.esComida() && this.monto() > EXCESO_CENA)
			return "X";
		return "";
	}

}
