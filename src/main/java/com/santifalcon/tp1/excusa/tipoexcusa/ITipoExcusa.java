package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.IEmpleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public interface ITipoExcusa {
	
	public void accion(Encargado encargado,IExcusa excusa);
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas);
	public String[] getEmailContenido(IEmpleado empleado);
}
