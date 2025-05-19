package com.santifalcon.tp1.modoaccion;

import com.santifalcon.tp1.empleado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;

public class ModoVago implements ModoAccion {

	@Override
	public void accionar(Encargado encargado, Excusa e) {
		encargado.pasar(e);
	}

}
