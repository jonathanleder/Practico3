package ar.unrn.eje3;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ReporteDeGastosTest {

	@Test
	void testImprimir() {
		List<Gasto> gastos = new ArrayList<Gasto>();
		Gasto ravioles = new Gasto(TipoDeGasto.CENA, 54);
		Gasto patente = new Gasto(TipoDeGasto.ALQUILER_AUTO, 36);
		gastos.add(ravioles);
		gastos.add(patente);

		ReporteDeGastos reporte = new ReporteDeGastos();

		reporte.imprimir(gastos);
	}

}
