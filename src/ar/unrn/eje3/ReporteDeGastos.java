package ar.unrn.eje3;

import java.util.ArrayList;
import java.util.Objects;

public class ReporteDeGastos {

	private ProveedorFecha fecha;
	private ArrayList<Gasto> gastos;
	private int total = 0;
	private int gastosDeComida = 0;
	private String informe;

	public ReporteDeGastos(ArrayList<Gasto> gastos, ProveedorFecha fecha) {

		this.gastos = Objects.requireNonNull(gastos);
		this.fecha = Objects.requireNonNull(fecha);
		this.informe = "Expensas " + fecha.fecha() + System.lineSeparator();
	}

	public String imprimir() {
		for (Gasto gasto : gastos) {
			if (gasto.esComida())
				gastosDeComida += gasto.monto();
			informe += gasto.nombre() + "\t" + gasto.monto() + "\t" + gasto.excesoComida() + System.lineSeparator();
			total += gasto.monto();
		}

		informe += "Gastos de comida: " + gastosDeComida + System.lineSeparator() + "Total de gastos: " + total;
		return informe;
	}

	public String fechaReporte() {
		return this.fecha.fecha();
	}
}
