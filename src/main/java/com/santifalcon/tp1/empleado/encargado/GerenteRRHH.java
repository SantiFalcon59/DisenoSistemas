package com.santifalcon.tp1.empleado.encargado;

public class GerenteRRHH extends Encargado {

	public GerenteRRHH(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
	}
	
   
	@Override
	public boolean isGerenteRRHH() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isRecepcionista() {
		// TODO Auto-generated method stub
		return false;
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
