package com.santifalcon.tp1.empleado.encargado;

public class Recepcionista extends Encargado {

	public Recepcionista(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
	}
	
	@Override
	public boolean isGerenteRRHH() {
		return false;
	}

	@Override
	public boolean isRecepcionista() {
		return true;
	}

	@Override
	public boolean isSupervisorArea() {
		return false;
	}

	@Override
	public boolean isEncargadoDefault() {
		return false;
	}

	@Override
	public boolean isCEO() {
		return false;
	}


}
