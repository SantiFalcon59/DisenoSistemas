package com.santifalocn.tp1.prontuario;

import com.santifalocn.tp1.empleado.Empleado;
import com.santifalocn.tp1.empleado.Encargado;
import com.santifalocn.tp1.excusa.Excusa;

public interface IProntuario {
	public Empleado getEmpleado();
	public Encargado getEncargado();
	public Excusa getExcusa();
	
}
