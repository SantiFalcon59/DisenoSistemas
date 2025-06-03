package com.santifalcon.tp1.excusa.interfaces;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.excusa.Excusa;

public interface ManejadorExcusas {
    void evaluarExcusa(Excusa excusa);
    void manejarExcusa(Excusa excusa);
    void pasarExcusa(Excusa excusa);
    void realizarAccion(Empleado empleado);
    void setSiguiente(ManejadorExcusas siguiente);
	boolean puedeManejar(Excusa excusa);
	boolean isGerenteRRHH();
	boolean isRecepcionista();
	boolean isSupervisorArea();
	boolean isEncargadoDefault();
	boolean isCEO();
	}