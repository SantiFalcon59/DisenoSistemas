package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.empleado.interfaces.IEncargado;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;
import com.santifalcon.tp1.modoaccion.ModoAccion;
import com.santifalcon.tp1.modoaccion.ModoNormal;
import com.santifalcon.tp1.modoaccion.ModoProductivo;
import com.santifalcon.tp1.modoaccion.ModoVago;

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
    public void evaluarExcusa(Excusa excusa) {
		modoAccion.accionar(this, excusa);
	}
	
    public void manejarExcusa(Excusa excusa) {
    	if (puedeManejar(excusa) ) {
    		excusa.accion(this);
    	} else {
    		pasarExcusa(excusa);
    	}
    
    }
	
	@Override
	public void pasarExcusa(Excusa excusa) {
        if (siguiente != null)  siguiente.evaluarExcusa(excusa);
    }

	
	@Override
	public void modoNormal() {
		this.modoAccion = new ModoNormal();
	}
	
	@Override
	public void modoProductivo() {
		this.modoAccion = new ModoProductivo();
	}
	
	@Override
	public void modoVago() {
		this.modoAccion = new ModoVago();
	}
	
	
}
