package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.excusa.Excusa;

public class SupervisorArea extends Encargado {

	public SupervisorArea(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
	}

	@Override
	public boolean puedeManejar(Excusa excusa) {
		 return excusa.puedeSerManejadaPor(this);
	}

	@Override
	public boolean isGerenteRRHH() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRecepcionista() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSupervisorArea() {
		// TODO Auto-generated method stub
		return true;
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

	@Override
	public void realizarAccion(Excusa excusa) {
		// TODO Auto-generated method stub
		
	}
}
