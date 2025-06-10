package com.santifalcon.tp1.excusa.tipoexcusa;


import com.santifalcon.tp1.empleado.IEmpleado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoTrivialExcusa extends TipoExcusa {

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isRecepcionista();
	}

	@Override
	public String[] getEmailContenido(IEmpleado empleado) {
		String[] asuntocontenido = {"motivo demora","solicitud aceptada",empleado.getEmail()};
		return asuntocontenido;
	
	}
	

}
