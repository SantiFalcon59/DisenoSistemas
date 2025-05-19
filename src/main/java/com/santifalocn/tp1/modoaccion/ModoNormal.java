package com.santifalocn.tp1.modoaccion;

import com.santifalocn.tp1.empleado.Encargado;
import com.santifalocn.tp1.excusa.Excusa;

public class ModoNormal implements ModoAccion {

	@Override
	public void accionar(Encargado encargado, Excusa e) {
		encargado.manejarExcusa(e);
	}

}
