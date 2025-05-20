package com.santifalcon.tp1.prontuario;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.Encargado;
import com.santifalcon.tp1.excusa.abstractas.Excusa;

public interface IProntuario {
	public Empleado getEmpleado();
	public Encargado getEncargado();
	public Excusa getExcusa();
	
}
