package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoTrivialExcusa extends TipoExcusa {

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isRecepcionista();
	}
	

}
