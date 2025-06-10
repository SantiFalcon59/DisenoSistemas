package com.santifalcon.tp1.excusa.interfaces;

public interface ManejadorExcusas {
    void manejarExcusa(IExcusa excusa);
    void pasarExcusa(IExcusa excusa);
    void realizarAccion(IExcusa excusa);
    void setSiguiente(ManejadorExcusas siguiente);
	ManejadorExcusas getSiguiente();
	boolean puedeManejar(IExcusa excusa);
	boolean isGerenteRRHH();
	boolean isRecepcionista();
	boolean isSupervisorArea();
	boolean isEncargadoDefault();
	boolean isCEO();

	}