package com.santifalocn.tp1.prontuario;

import com.santifalocn.tp1.empleado.Empleado;
import com.santifalocn.tp1.empleado.Encargado;
import com.santifalocn.tp1.excusa.Excusa;

public class Prontuario implements IProntuario {

	private Encargado encargado;
	private Empleado empleado;
	private Excusa excusa;
	

	public Prontuario(Empleado empleado, Encargado encargado, Excusa excusa) {
		this.empleado = empleado;
		this.encargado = encargado;
		this.excusa = excusa;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	
	public Encargado getEncargado() {
		return this.encargado;
	}
	public Excusa getExcusa() {
		return excusa;
	}


}
