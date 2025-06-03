package com.santifalcon.tp1.excusa.interfaces;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;

public interface IExcusa {
	
	public Empleado getEmpleado();
	public void accion(Encargado encargado);
	boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas);
}
