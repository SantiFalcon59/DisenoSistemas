package com.santifalcon.tp1.prontuario;

import com.santifalcon.tp1.empleado.IEmpleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;
import com.santifalcon.tp1.prontuario.interfaces.IProntuario;

public class Prontuario implements IProntuario {

	private Encargado encargado;
	private IEmpleado empleado;
	private IExcusa excusa;
	

	public Prontuario(IEmpleado empleado, Encargado encargado, IExcusa excusa) {
		this.empleado = empleado;
		this.encargado = encargado;
		this.excusa = excusa;
	}
	public IEmpleado getEmpleado() {
		return empleado;
	}
	
	public Encargado getEncargado() {
		return this.encargado;
	}
	public IExcusa getExcusa() {
		return excusa;
	}


}
