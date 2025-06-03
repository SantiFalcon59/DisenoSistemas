package com.santifalcon.tp1.prontuario.interfaces;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;

public interface IProntuario {
	public Empleado getEmpleado();
	public Encargado getEncargado();
	public Excusa getExcusa();
	
}
