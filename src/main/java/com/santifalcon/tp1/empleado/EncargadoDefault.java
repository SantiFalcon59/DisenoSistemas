package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.modoaccion.ModoAccion;

public class EncargadoDefault extends Encargado {

	public EncargadoDefault(String nombre, String email, int legajo,ModoAccion modoAccion) {
		super(nombre, email, legajo,modoAccion);
	}

	@Override
	public void manejarExcusa(Excusa excusa) {
		 System.out.println("Excusa rechazada: necesitamos pruebas contundentes");
	}
	
	@Override
	public boolean puedeManejar(Excusa excusa) {
		return true;
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
		return false;
	}

	@Override
	public boolean isEncargadoDefault() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCEO() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
