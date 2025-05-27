package com.santifalcon.tp1.excusa;

public interface ManejadorExcusas {
    void evaluarExcusa(Excusa excusa);
    void manejarExcusa(Excusa excusa);
    void pasarExcusa(Excusa excusa);
    void setSiguiente(ManejadorExcusas siguiente);
	boolean puedeManejar(Excusa excusa);
	boolean isGerenteRRHH();
	boolean isRecepcionista();
	boolean isSupervisorArea();
	boolean isEncargadoDefault();
	boolean isCEO();
	}