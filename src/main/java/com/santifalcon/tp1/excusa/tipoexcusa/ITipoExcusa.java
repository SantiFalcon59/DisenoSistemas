package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public interface ITipoExcusa {
	
	public void accion(Encargado encargado,Excusa excusa);
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas);
	public String[] getEmailContenido(Empleado empleado);
}
