package com.santifalcon.tp1.excusa.abstractas;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.excusa.IExcusa;

public abstract class Excusa implements IExcusa {

	private Empleado empleado;
	private String mensaje;
	
	public Excusa(Empleado empleado,String mensaje) {
		this.empleado = empleado;
	}
	
	@Override
	public Empleado getEmpleado() {
		return this.empleado;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	
	
}
