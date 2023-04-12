package ar.unrn.eje1;

public class LibroNuevo extends Libro {

	public static final int NUEVO_LANZAMIENTO = 1;
	/* Arreglar los numeros magicos */

	public LibroNuevo(String nombre, int priceCode) {
		super(nombre, priceCode);

	}

	@Override
	public double calcularMonto(int diasAlquilados) {
		return this.monto += diasAlquilados * 3;
	}

}
