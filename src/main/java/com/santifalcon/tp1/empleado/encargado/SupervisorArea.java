package com.santifalcon.tp1.empleado.encargado;

public class SupervisorArea extends Encargado {

	public SupervisorArea(String nombre, String email, int legajo) {
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
		return true;
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
