package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.excusa.abstractas.Excusa;
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

	
	
}
