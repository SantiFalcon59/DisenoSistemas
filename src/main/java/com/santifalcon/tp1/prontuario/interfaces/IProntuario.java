package com.santifalcon.tp1.prontuario.interfaces;

import com.santifalcon.tp1.empleado.IEmpleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;

public interface IProntuario {
	public IEmpleado getEmpleado();
	public Encargado getEncargado();
	public IExcusa getExcusa();
	
}
