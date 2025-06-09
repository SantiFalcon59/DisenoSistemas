package com.santifalcon.tp1.empleado.encargado;


public class EncargadoBase extends Encargado {

	public EncargadoBase(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
	}

	@Override
	public boolean isGerenteRRHH() {
		return false;
	}

	@Override
	public boolean isRecepcionista() {
		return false;
	}

	@Override
	public boolean isSupervisorArea() {
		return false;
	}

	@Override
	public boolean isEncargadoDefault() {
		return true;
	}

	@Override
	public boolean isCEO() {
		return false;
	}




	
	
}
