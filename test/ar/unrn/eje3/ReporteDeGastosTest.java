package ar.unrn.eje3;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ReporteDeGastosTest {

	@Test
	void testImprimir() {
		ProveedorFecha fechaDeHoy = new FechaFake();// El fecha fake funciona con "2023-04-16"
		ArrayList<Gasto> gastos = new ArrayList<Gasto>();
		Gasto ravioles = new Cena(TipoDeGasto.CENA, 5500);
		Gasto patente = new AlquilerAuto(TipoDeGasto.ALQUILER_AUTO, 36);
		Gasto patenteMoto = new AlquilerAuto(TipoDeGasto.ALQUILER_AUTO, 2);
		Gasto cafeConLecha = new Desayuno(TipoDeGasto.DESAYUNO, 1500);
		gastos.add(ravioles);
		gastos.add(cafeConLecha);
		gastos.add(patente);
		gastos.add(patenteMoto);

		ReporteDeGastos reporte = new ReporteDeGastos(gastos, fechaDeHoy);

		// System.out.println(reporte.imprimir());

		String resultado = "Expensas " + fechaDeHoy.fecha() + System.lineSeparator() + "CENA" + "\t" + 5500 + "\t" + "X"
				+ System.lineSeparator() + "DESAYUNO" + "\t" + 1500 + "\t" + "X" + System.lineSeparator()
				+ "ALQUILER_AUTO" + "\t" + 36 + "\t" + "" + System.lineSeparator() + "ALQUILER_AUTO" + "\t" + 2 + "\t"
				+ "" + System.lineSeparator() + "Gastos de comida: " + 7000 + System.lineSeparator()
				+ "Total de gastos: " + 7038;

		Assert.assertEquals("2023-04-16", reporte.fechaReporte());
		Assert.assertEquals(resultado, reporte.imprimir());

	}

}
