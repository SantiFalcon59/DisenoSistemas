package com.santifalcon.tp1.modoaccion;

import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;

public class ModoNormal implements ModoAccion {

	@Override
	public void accionar(Encargado encargado, Excusa excusa) {
		encargado.manejarExcusa(excusa);
	}

}
