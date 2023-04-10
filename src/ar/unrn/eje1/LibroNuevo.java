package ar.unrn.eje1;

public class LibroNuevo extends Libro {

	public LibroNuevo(String nombre, int priceCode) {
		super(nombre, priceCode);
	}

	@Override
	public double calcularMonto(int diasAlquilados) {
		return this.monto += diasAlquilados * 3;
	}

}
