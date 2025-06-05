package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;

public abstract class TipoExcusa implements ITipoExcusa {

	
	@Override
	public void accion(Encargado encargado, Excusa excusa) {
	encargado.realizarAccion(excusa);
	}
	}
	
