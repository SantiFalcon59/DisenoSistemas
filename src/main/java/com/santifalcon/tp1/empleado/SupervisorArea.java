package com.santifalcon.tp1.empleado;


import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.modoaccion.ModoAccion;

public class SupervisorArea extends Encargado {

	public SupervisorArea(String nombre, String email, int legajo,ModoAccion modoAccion) {
		super(nombre, email, legajo, modoAccion);
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
}
