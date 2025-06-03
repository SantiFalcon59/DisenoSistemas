package com.santifalcon.tp1.empleado.encargado.lineaencargados;

import java.util.ArrayList;
import java.util.List;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class ManejadoresDeExcusas implements IManejadoresDeExcusas {

    private List<ManejadorExcusas> manejadoresExcusas;
    private ManejadorExcusas ultimoManejadorDeExcusas;

    public ManejadoresDeExcusas(ManejadorExcusas manejadorExcusasInicial, ManejadorExcusas manejadorExcusasFinal) {
        this.manejadoresExcusas = new ArrayList<>();
        this.manejadoresExcusas.add(manejadorExcusasInicial);
        this.manejadoresExcusas.add(manejadorExcusasFinal);   
        this.ultimoManejadorDeExcusas = manejadorExcusasFinal;  
        manejadorExcusasInicial.setSiguiente(manejadorExcusasFinal); 
    }


    public void agregar(ManejadorExcusas manejadorExcusas) {
        this.manejadoresExcusas.add(this.manejadoresExcusas.size() - 1, manejadorExcusas);
        ManejadorExcusas penultimo = this.manejadoresExcusas.get(this.manejadoresExcusas.size() - 2);
        penultimo.setSiguiente(manejadorExcusas);
        manejadorExcusas.setSiguiente(this.ultimoManejadorDeExcusas); 
    }
    
    public void manejarExcusa(Excusa excusa) {
    	this.manejadoresExcusas.get(0).evaluarExcusa(excusa);
    }


	@Override
	public String toString() {
		return "ManejadoresDeExcusas [manejadoresExcusas=" + manejadoresExcusas + ", ultimoManejadorDeExcusas="
				+ ultimoManejadorDeExcusas + "]";
	}
    
    
    
    
}
