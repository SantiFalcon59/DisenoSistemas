package com.santifalcon.tp1.empleado.encargado.modoaccion;

import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;

public class ModoVago implements ModoAccion {

	@Override
	public void evaluar(Encargado encargado, Excusa excusa) {
		encargado.pasarExcusa(excusa);
	}

}
