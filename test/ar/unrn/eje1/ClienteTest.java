package ar.unrn.eje1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void testCalcularDeudaYPuntosObtenidos() {

		Libro elTunel = new LibroRegular("El Tunel", LibroRegular.REGULARES);
		Libro antesDelFin = new LibroRegular("Antes del Fin", LibroRegular.REGULARES);
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		Recibo resultado = yo.calcularDeudaYPuntosObtenidos();
		System.out.println(resultado.montoTotal());
		System.out.println(resultado.puntosObtenidos());

		assertEquals(10.0, resultado.montoTotal());
		assertEquals(2, resultado.puntosObtenidos());
	}

}
