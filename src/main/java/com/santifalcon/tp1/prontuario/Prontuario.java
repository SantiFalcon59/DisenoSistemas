package com.santifalcon.tp1.prontuario;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;

public class Prontuario extends ProntuarioObservable {

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
