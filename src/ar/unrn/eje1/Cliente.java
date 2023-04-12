package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

	private List<Alquiler> alquileres;
	private String name;

	public Cliente(String nombre) {

		alquileres = new ArrayList<Alquiler>();
		name = Objects.requireNonNull(nombre);

	}

	public Recibo calcularDeudaYPuntosObtenidos() {
		Double montoTotal = 0.0;
		Integer puntosAlquilerFrecuente = 0;
		for (Alquiler alquiler : alquileres) {
			montoTotal += alquiler.calcularMonto();
			puntosAlquilerFrecuente += alquiler.sumarPuntos();
		}

		return new Recibo(montoTotal, puntosAlquilerFrecuente);
	}

	public void alquilar(Alquiler rental) {
		alquileres.add(rental);
	}
}