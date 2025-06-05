package com.santifalcon.tp1.empleado.encargado;

public class Recepcionista extends Encargado {

	public Recepcionista(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
	}
	
	@Override
	public boolean isGerenteRRHH() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRecepcionista() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isSupervisorArea() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEncargadoDefault() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCEO() {
		// TODO Auto-generated method stub
		return false;
	}


}
