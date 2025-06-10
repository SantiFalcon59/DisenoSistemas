package com.santifalcon.tp1.empleado.encargado.lineaencargados;

import com.santifalcon.tp1.excusa.interfaces.IExcusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public interface ILineaDeManejadoresDeExcusas {
	
	void agregar(ManejadorExcusas manejadorExcusas);
	void manejarExcusa(IExcusa excusa);
	
}
