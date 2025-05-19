package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.ManejadorExcusas;
import com.santifalcon.tp1.modoaccion.ModoAccion;

public abstract class Encargado extends Empleado implements ManejadorExcusas,IEncargado {

	private ManejadorExcusas siguiente;
	private ModoAccion modoAccion;
	
	public Encargado(String nombre, String email, int legajo, ModoAccion modoAccion) {
		super(nombre, email, legajo);
		this.modoAccion = modoAccion;
	}
	
	@Override
	public ModoAccion getModoAccion() {
		return this.modoAccion;
	}
	
	@Override
	public void setSiguiente(ManejadorExcusas siguiente) {
		this.siguiente = siguiente;
	}
	
	@Override
	public void manejarExcusa(Excusa excusa) {
		modoAccion.accionar(this, excusa);
	}
	
	@Override
	public void pasar(Excusa excusa) {
        if (siguiente != null)  siguiente.manejarExcusa(excusa);
            System.out.println("Excusa rechazada: necesitamos pruebas contundentes");
        
    }

	
}
