package com.santifalcon.tp1.excusa;

import com.santifalcon.tp1.excusa.abstractas.Excusa;

public interface ManejadorExcusas {
    void revisarExcusa(Excusa excusa);
    void manejarExcusa(Excusa excusa);
    void setSiguiente(ManejadorExcusas siguiente);
	boolean puedeManejar(Excusa excusa);
}