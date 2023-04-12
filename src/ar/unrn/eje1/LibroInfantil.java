package ar.unrn.eje1;

public class LibroInfantil extends Libro {
	public static final int INFANTILES = 2;
	private static final int TRES_DIAS = 3;

	public LibroInfantil(String nombre, int priceCode) {
		super(nombre, priceCode);
	}

	public double calcularMonto(int diasAlquilados) {
		this.monto += 1.5;
		if (alquilaMasDeTresDias(diasAlquilados))
			monto += (diasAlquilados - 3) * 1.5;
		return this.monto;
	}

	private boolean alquilaMasDeTresDias(int diasAlquilados) {
		return diasAlquilados > TRES_DIAS;
	}

}
