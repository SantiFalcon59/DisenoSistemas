package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.IEmpleado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoCuidarFamiliarExcusa extends TipoExcusa {

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isSupervisorArea();
	}



	@Override
	public String[] getEmailContenido(IEmpleado empleado) {
		String[] asuntocontenido = {"tas bien¿","Nos hemos enterado de los problemas en tu familia, como tas?"
				,empleado.getEmail()};
		return asuntocontenido;
	
	}

}
