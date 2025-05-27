package com.santifalcon.tp1.excusa;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.Encargado;

public interface IExcusa {
	
	public Empleado getEmpleado();
	public void accion(Encargado encargado);
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas);
}
