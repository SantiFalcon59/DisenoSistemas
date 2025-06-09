package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.modoaccion.ModoAccion;
import com.santifalcon.tp1.empleado.encargado.modoaccion.ModoNormal;
import com.santifalcon.tp1.empleado.encargado.modoaccion.ModoProductivo;
import com.santifalcon.tp1.empleado.encargado.modoaccion.ModoVago;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public abstract class Encargado extends Empleado implements ManejadorExcusas,IEncargado {

	private ManejadorExcusas siguiente;
	private ModoAccion modoAccion;
	
	public Encargado(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
		modoNormal();
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
	public ManejadorExcusas getSiguiente() {
		return this.siguiente;
	}
	
	@Override
	public void enviarEmail(String origen, String destino, String asunto, String contenido) {
	new EmailSender().enviarEmail(origen,destino,asunto,contenido);
	}
	
	
	@Override
	public void realizarAccion(Excusa excusa) {
		String origen = this.getEmail();
		String asunto = excusa.getEmailContenido(excusa.getEmpleado())[0];
		String contenido = excusa.getEmailContenido(excusa.getEmpleado())[1];
		String destino = excusa.getEmailContenido(excusa.getEmpleado())[2];
		this.enviarEmail(origen, destino, asunto, contenido);
	}
	
	
	 @Override
		public boolean puedeManejar(Excusa excusa) {
	    	 return excusa.puedeSerManejadaPor(this);
	    }

	
    public void manejarExcusa(Excusa excusa) {
    	if (puedeManejar(excusa) ) {
    		this.modoAccion.evaluar(this, excusa);
    	} else {
    		pasarExcusa(excusa);
    	}
    
    }
	
	@Override
	public void pasarExcusa(Excusa excusa) {
        if (siguiente != null)  siguiente.manejarExcusa(excusa);
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
