package com.santifalcon.tp1.empleado.encargado.lineaencargados;

import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public interface ILineaDeManejadoresDeExcusas {
	
	void agregar(ManejadorExcusas manejadorExcusas);
	void manejarExcusa(Excusa excusa);
	
}
