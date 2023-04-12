package ar.unrn.eje1;

public class CopiaLibro {
	private Libro libro;

	public CopiaLibro(Libro libro) {
		this.libro = libro;
	}

	public Double calcularMonto(int diasAlquilados) {
		return this.libro.calcularMonto(diasAlquilados);
	}

	public Libro libro() {
		return libro;
	}
}