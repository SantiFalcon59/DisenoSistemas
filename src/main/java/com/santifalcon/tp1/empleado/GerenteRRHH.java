package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.subtipos.InverosimilExcusa;
import com.santifalcon.tp1.modoaccion.ModoAccion;

public class GerenteRRHH extends Encargado {

	public GerenteRRHH(String nombre, String email, int legajo,ModoAccion modoAccion) {
		super(nombre, email, legajo,modoAccion);
	}
	
    @Override
	public boolean puedeManejar(Excusa excusa) {
        return excusa instanceof InverosimilExcusa;
    }

}
