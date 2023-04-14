package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class Recaudacion {

	private static Filtro COMPANIA = Filtro.COMPANIA;
	private static Filtro CIUDAD = Filtro.CIUDAD;
	private static Filtro ESTADO = Filtro.ESTADO;
	private static Filtro ENTORNO = Filtro.ENTORNO;

	public static List<Map<String, String>> donde(Map<String, String> options) throws IOException {

		CSV controlador = new CSV(new ArrayList<String[]>(), new CSVReader(new FileReader("data.csv")),
				((HashMap<String, String>) options));
		controlador.cargarCSV();

		if (options.containsKey(COMPANIA.obtenerNombre())) {
			controlador.filtrarPorTipo(COMPANIA.obtenerNombre(), COMPANIA.obtenerValor());
		}

		if (options.containsKey(CIUDAD.obtenerNombre())) {
			controlador.filtrarPorTipo(CIUDAD.obtenerNombre(), CIUDAD.obtenerValor());
		}

		if (options.containsKey(ESTADO.obtenerNombre())) {

			controlador.filtrarPorTipo(ESTADO.obtenerNombre(), ESTADO.obtenerValor());
		}

		if (options.containsKey(ENTORNO.obtenerNombre())) {
			controlador.filtrarPorTipo(ENTORNO.obtenerNombre(), ENTORNO.obtenerValor());
		}

		return controlador.cargarMapa();
	}

}