package com.santifalcon.tp1.excusa.tipoexcusa;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoComplejaExcusa extends TipoExcusa {


	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isGerenteRRHH();
	}

	@Override
	public String[] getEmailContenido(Empleado empleado) {
		String[] asuntocontenido = {"Solicitud de excusa.","Buenas tardes, hemos aceptado su excusa!",empleado.getEmail()};
		return asuntocontenido;
	}





}
