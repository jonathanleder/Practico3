package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {

	Gasto unGasto = new Gasto(TipoDeGasto.CENA, 295);

	public String imprimir(List<Gasto> gastos) {
		int total = 0;
		int gastosDeComida = 0;

		System.out.println("Expensas " + LocalDate.now());

		for (Gasto gasto : gastos) {
			if (gasto.tipoGasto() == TipoDeGasto.CENA || gasto.tipoGasto() == TipoDeGasto.DESAYUNO) {
				gastosDeComida += gasto.monto();
			}

			String nombreGasto = "";
			switch (gasto.tipoGasto()) {
			case CENA:
				nombreGasto = "Cena";
				break;
			case DESAYUNO:
				nombreGasto = "Desayuno";
				break;
			case ALQUILER_AUTO:
				nombreGasto = "Alquiler de Autos";
				break;
			}

			String marcaExcesoComidas = gasto.tipoGasto() == TipoDeGasto.CENA && gasto.monto() > 5000
					|| gasto.tipoGasto() == TipoDeGasto.DESAYUNO && gasto.monto() > 1000 ? "X" : " ";

			System.out.println(nombreGasto + "\t" + gasto.monto() + "\t" + marcaExcesoComidas);

			total += gasto.monto();
		}

		String imprimir = "Gastos de comida: " + gastosDeComida;
		String esto = " Total de gastos: " + total;
		System.out.println("Gastos de comida: " + gastosDeComida);
		System.out.println("Total de gastos: " + total);
		return imprimir.concat(esto);
	}
}
