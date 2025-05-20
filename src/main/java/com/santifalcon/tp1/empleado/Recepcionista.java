package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.excusa.abstractas.Excusa;
import com.santifalcon.tp1.excusa.abstractas.TrivialExcusa;
import com.santifalcon.tp1.modoaccion.ModoAccion;

public class Recepcionista extends Encargado {

	public Recepcionista(String nombre, String email, int legajo,ModoAccion modoAccion) {
		super(nombre, email, legajo,modoAccion);
	}
	
    @Override
	public boolean puedeManejar(Excusa excusa) {
        return excusa instanceof TrivialExcusa;
    }

}
