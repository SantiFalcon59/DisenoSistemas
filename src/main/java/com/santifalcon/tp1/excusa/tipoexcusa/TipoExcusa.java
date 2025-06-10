package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;

public abstract class TipoExcusa implements ITipoExcusa {

	
	@Override
	public void accion(Encargado encargado, IExcusa excusa) {
	encargado.realizarAccion(excusa);
	}
	}
	
