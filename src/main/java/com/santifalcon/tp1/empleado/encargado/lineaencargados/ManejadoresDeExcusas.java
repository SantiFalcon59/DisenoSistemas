package com.santifalcon.tp1.empleado.encargado.lineaencargados;

import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class ManejadoresDeExcusas implements IManejadoresDeExcusas {

    private ManejadorExcusas manejadorInicial;
    private final ManejadorExcusas manejadorFinal;

    public ManejadoresDeExcusas(ManejadorExcusas manejadorInicial, ManejadorExcusas manejadorFinal) {
        this.manejadorInicial = manejadorInicial;
        this.manejadorFinal = manejadorFinal;
        manejadorInicial.setSiguiente(manejadorFinal);
    }

    public void agregar(ManejadorExcusas nuevo) {
        ManejadorExcusas actual = manejadorInicial;
        while (actual.getSiguiente() != manejadorFinal) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
        nuevo.setSiguiente(manejadorFinal);
    }

    public void manejarExcusa(Excusa excusa) {
        manejadorInicial.evaluarExcusa(excusa);
    }
}
