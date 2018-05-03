package com.calculatorRest.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Clase que dispone de las cuatro operaciones 
 * básicas de la calculadora
 * 
 * @author Diana Martinez
 *         http://localhost:8082/CalculatorService/api/v1/calculator/add/4/-2/1
 */
@Path("/api/v1/calculator")
public class ServiceCalculateOperation { 

	@GET
	@Path("/add/{numeros: [a-zA-Z0-9-/]+}")
	// @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public double add(@PathParam("numeros") String cadenanumeros) {

		double totalSuma = 0;
		NumerosVO numeros = new NumerosVO(cadenanumeros);
		totalSuma = numeros.obtenerNumerosDesdeUnaCadena().get(0);
		for (int i = 1; i < numeros.obtenerNumerosDesdeUnaCadena().size(); i++) {
			totalSuma += numeros.obtenerNumerosDesdeUnaCadena().get(i);
		}
		return totalSuma;
	}

	@GET
	@Path("/subs/{numeros: [a-zA-Z0-9-/]+}")
	@Produces(MediaType.TEXT_PLAIN)
	public double subs(@PathParam("numeros") String cadenanumeros) {
		double totalResta = 0;
		NumerosVO numeros = new NumerosVO(cadenanumeros);
		totalResta = numeros.obtenerNumerosDesdeUnaCadena().get(0);
		for (int i = 1; i < numeros.obtenerNumerosDesdeUnaCadena().size(); i++) {
			totalResta -= numeros.obtenerNumerosDesdeUnaCadena().get(i);
		}
		return totalResta;
	}

	@GET
	@Path("/mult/{numeros: [a-zA-Z0-9-/]+}")
	@Produces(MediaType.TEXT_PLAIN)
	public double mult(@PathParam("numeros") String cadenanumeros) {
		double totalMultiplicacion = 0;
		NumerosVO numeros = new NumerosVO(cadenanumeros);
		totalMultiplicacion = numeros.obtenerNumerosDesdeUnaCadena().get(0);
		for (int i = 1; i < numeros.obtenerNumerosDesdeUnaCadena().size(); i++) {
			totalMultiplicacion *= numeros.obtenerNumerosDesdeUnaCadena().get(i);
		}
		return totalMultiplicacion;
	}

	@GET
	@Path("/div/{numeros: [a-zA-Z0-9-/]+}")
	@Produces(MediaType.TEXT_PLAIN)
	public double div(@PathParam("numeros") String cadenanumeros) {
		double totalDivision = 0;
		NumerosVO numeros = new NumerosVO(cadenanumeros);
		totalDivision = numeros.obtenerNumerosDesdeUnaCadena().get(0);
		for (int i = 1; i < numeros.obtenerNumerosDesdeUnaCadena().size(); i++) {
			totalDivision /= numeros.obtenerNumerosDesdeUnaCadena().get(i);
		}
		return totalDivision;
	}

}
