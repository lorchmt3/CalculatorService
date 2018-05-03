package com.calculatorRest.ws;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Diana Martinez 
 * Objeto que obtiene una cadena para separar los números
 *         involucrados en cada una de las operaciones
 *
 */
public class NumerosVO {

	String cadenaNumeros;

	/**
	 * constructor
	 */
	public NumerosVO() {
		// TODO Auto-generated constructor stub
	}

	public NumerosVO(String cadenaNumeros) {
		this.cadenaNumeros = cadenaNumeros;
	}

	public List<Double> obtenerNumerosDesdeUnaCadena() {
		String[] n = this.cadenaNumeros.split("/");
		List<Double> numerosAOperar = new ArrayList<>();
		for (String num : n) {
			double numero = Double.parseDouble(num);
			numerosAOperar.add(numero);
		}
		return numerosAOperar;
	}

}
