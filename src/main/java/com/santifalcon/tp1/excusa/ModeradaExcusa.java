package com.santifalcon.tp1.excusa;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public abstract class ModeradaExcusa extends Excusa {

	public ModeradaExcusa(Empleado empleado,String mensaje) {
		super(empleado,mensaje);
	}
	
	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isSupervisorArea();
	}

}
