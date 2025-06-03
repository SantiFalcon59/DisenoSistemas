package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public interface ITipoExcusa {
	
	public void accion(Encargado encargado,Empleado empleado);
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas);
}
