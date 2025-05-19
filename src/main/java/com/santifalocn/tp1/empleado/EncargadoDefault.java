package com.santifalocn.tp1.empleado;

import com.santifalocn.tp1.excusa.Excusa;
import com.santifalocn.tp1.modoaccion.ModoAccion;

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

	
	
}
