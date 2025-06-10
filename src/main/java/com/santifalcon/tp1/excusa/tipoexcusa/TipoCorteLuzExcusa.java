package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.IEmpleado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoCorteLuzExcusa extends TipoModeradaExcusa {


	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isSupervisorArea();
	}

	@Override
	public String[] getEmailContenido(IEmpleado empleado) {
		String[] asuntocontenido = {"se fue la luz?",empleado.getNombre() + 
				" nos ha dicho que no tiene luz, por favor validar","edesur@emailfake.com.ar"};
		return asuntocontenido;
	}
}
