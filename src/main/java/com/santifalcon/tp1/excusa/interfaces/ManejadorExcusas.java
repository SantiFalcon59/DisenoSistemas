package com.santifalcon.tp1.excusa.interfaces;

import com.santifalcon.tp1.excusa.Excusa;

public interface ManejadorExcusas {
    void manejarExcusa(Excusa excusa);
    void pasarExcusa(Excusa excusa);
    void realizarAccion(Excusa excusa);
    void setSiguiente(ManejadorExcusas siguiente);
	ManejadorExcusas getSiguiente();
	boolean puedeManejar(Excusa excusa);
	boolean isGerenteRRHH();
	boolean isRecepcionista();
	boolean isSupervisorArea();
	boolean isEncargadoDefault();
	boolean isCEO();

	}