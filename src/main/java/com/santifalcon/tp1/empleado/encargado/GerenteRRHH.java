package com.santifalcon.tp1.empleado.encargado;

public class GerenteRRHH extends Encargado {

	public GerenteRRHH(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
	}
	
   
	@Override
	public boolean isGerenteRRHH() {
		return true;
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
		return false;
	}

	@Override
	public boolean isCEO() {
		return false;
	}


}
