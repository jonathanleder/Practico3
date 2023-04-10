package ar.unrn.eje1;

public class LibroInfantil extends Libro {

	public LibroInfantil(String nombre, int priceCode) {
		super(nombre, priceCode);
	}

	public double calcularMonto(int diasAlquilados) {
		this.monto += 1.5;
		if (diasAlquilados > 3)
			monto += (diasAlquilados - 3) * 1.5;
		return this.monto;
	}

}
