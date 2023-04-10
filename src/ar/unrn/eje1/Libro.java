package ar.unrn.eje1;

public class Libro {
	public static final int INFANTILES = 2;
	public static final int REGULARES = 0;
	public static final int NUEVO_LANZAMIENTO = 1;
	double monto;
	private String nombre;
	private int codigoPrecio;

	public Libro(String nombre, int priceCode) {
		this.nombre = nombre;
		this.codigoPrecio = priceCode;
		this.monto = 0;
	}

	public int codigoPrecio() {
		return codigoPrecio;
	}

	public double calcularMonto(int diasAlquilados) {
		this.monto += 2;
		if (diasAlquilados > 2)
			this.monto += (diasAlquilados - 2) * 1.5;
		return this.monto;
	}

	public double monto() {

		return this.monto = 2;
	}

	public String nombre() {
		return nombre;
	}
}