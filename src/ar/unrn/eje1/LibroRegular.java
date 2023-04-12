package ar.unrn.eje1;

public class LibroRegular extends Libro {
	public static final int REGULARES = 0;

	public LibroRegular(String nombre, int priceCode) {
		super(nombre, priceCode);
	}

	public double calcularMonto(int diasAlquilados) {
		this.monto += 2;
		if (diasAlquilados > 2)
			this.monto += (diasAlquilados - 2) * 1.5;
		return this.monto;
	}
}
