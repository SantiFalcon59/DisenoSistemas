package com.santifalcon.tp1.modoaccion;

import com.santifalcon.tp1.empleado.Encargado;
import com.santifalcon.tp1.excusa.abstractas.Excusa;

public class ModoNormal implements ModoAccion {

	@Override
	public void accionar(Encargado encargado, Excusa excusa) {
		excusa.accion(encargado);
	}

}
