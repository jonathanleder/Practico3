package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Alquiler> alquileres = new ArrayList<Alquiler>();
	private String name;
	private int puntosAlquilerFrecuente;

	public Cliente(String nombre) {
		this.name = nombre;
		this.puntosAlquilerFrecuente = 0;// Los puntos de alquiler deben guardarse en el cliente para que no se
											// reinicien en cada invocacion al metodo
	}

	public Object[] calcularDeudaYPuntosObtenidos() {
		Object[] resultado = new Object[2];
		double total = 0;
		for (Alquiler alquiler : alquileres) {

			total += calcularMonto(alquiler);// invoco para saber cuanto cuesta el libro de cada alquiler
			this.puntosAlquilerFrecuente++;
			if ((alquiler.esLibroNuevo()) && alquiler.diasAlquilados() > 1) {
				this.puntosAlquilerFrecuente++;
			}
		}
		resultado[0] = total;
		resultado[1] = this.puntosAlquilerFrecuente;
		return resultado;
	}

	private double calcularMonto(Alquiler alquiler) {
		return alquiler.copia().libro().calcularMonto(alquiler.diasAlquilados());// De acuerdo al tipo delibro que este
																					// guardado dentro de la lista de
																					// alquileres va a calcular segun su
																					// tipo
	}

	public void alquilar(Alquiler rental) {
		alquileres.add(rental);
	}
}