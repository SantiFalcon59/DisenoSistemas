package com.santifalocn.tp1.excusa;

public interface ManejadorExcusas {
    void manejarExcusa(Excusa excusa);
    void setSiguiente(ManejadorExcusas siguiente);
	boolean puedeManejar(Excusa excusa);
}