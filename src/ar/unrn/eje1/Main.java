package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {
		Libro elTunel = new LibroRegular("El Tunel", LibroRegular.REGULARES);
		Libro antesDelFin = new LibroRegular("Antes del Fin", LibroRegular.REGULARES);
		LibroNuevo harryPotter = new LibroNuevo("", LibroNuevo.NUEVO_LANZAMIENTO);
		CopiaLibro harryPotterCopia = new CopiaLibro(harryPotter);
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerHarryPotter = new Alquiler(harryPotterCopia, 7);
		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerHarryPotter);
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		Recibo resultado = yo.calcularDeudaYPuntosObtenidos();
		System.out.println(resultado.montoTotal());
		System.out.println(resultado.puntosObtenidos());
	}
}