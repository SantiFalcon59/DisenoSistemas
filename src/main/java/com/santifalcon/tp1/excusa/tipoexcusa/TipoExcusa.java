package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;

public abstract class TipoExcusa implements ITipoExcusa {

	
	@Override
	public void accion(Encargado encargado, Empleado empleado) {
	encargado.realizarAccion(empleado);
	}
	}
	
