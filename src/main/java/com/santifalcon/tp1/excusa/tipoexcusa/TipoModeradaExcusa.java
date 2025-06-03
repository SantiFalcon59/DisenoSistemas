package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public abstract class TipoModeradaExcusa extends TipoExcusa {

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isSupervisorArea();
	}

}
