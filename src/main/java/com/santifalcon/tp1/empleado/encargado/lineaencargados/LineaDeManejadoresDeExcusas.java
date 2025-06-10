package com.santifalcon.tp1.empleado.encargado.lineaencargados;

import com.santifalcon.tp1.excusa.interfaces.IExcusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class LineaDeManejadoresDeExcusas implements ILineaDeManejadoresDeExcusas {

    private ManejadorExcusas manejadorInicial;
    private final ManejadorExcusas manejadorFinal;

    public LineaDeManejadoresDeExcusas(ManejadorExcusas manejadorInicial, ManejadorExcusas manejadorFinal) {
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

    public void manejarExcusa(IExcusa excusa) {
        manejadorInicial.manejarExcusa(excusa);
    }
}
