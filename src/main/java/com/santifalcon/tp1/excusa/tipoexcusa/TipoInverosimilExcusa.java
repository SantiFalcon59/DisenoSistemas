package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoInverosimilExcusa extends TipoExcusa {


	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isCEO();
	}

	@Override
	public String[] getEmailContenido(Empleado empleado) {
		String[] asuntocontenido = {"aprobado por creatividad","aprobado por creatividad",empleado.getEmail()};
		return asuntocontenido;
	
	}

}
