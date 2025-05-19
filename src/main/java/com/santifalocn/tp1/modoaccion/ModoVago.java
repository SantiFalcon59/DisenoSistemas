package com.santifalocn.tp1.modoaccion;

import com.santifalocn.tp1.empleado.Encargado;
import com.santifalocn.tp1.excusa.Excusa;

public class ModoVago implements ModoAccion {

	@Override
	public void accionar(Encargado encargado, Excusa e) {
		encargado.pasar(e);
	}

}
