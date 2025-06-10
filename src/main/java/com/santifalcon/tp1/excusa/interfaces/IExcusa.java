package com.santifalcon.tp1.excusa.interfaces;

import com.santifalcon.tp1.empleado.IEmpleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;

public interface IExcusa {
	
	public IEmpleado getEmpleado();
	public String getMensaje();
	public void evaluar(Encargado encargado);
	boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas);
	String[] getEmailContenido(IEmpleado empleado);
}
