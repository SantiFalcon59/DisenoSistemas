package com.santifalcon.tp1.excusa;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class RechazadorExcusas implements ManejadorExcusas {

	
	@Override
	public void evaluarExcusa(Excusa excusa) {
		manejarExcusa(excusa);
		
	}

	@Override
	public void manejarExcusa(Excusa excusa) {
		realizarAccion(excusa);
		
	}

	@Override
	public void pasarExcusa(Excusa excusa) {
		
	}

	@Override
	public void realizarAccion(Excusa excusa) {
		excusa.setProcesadoPor(this);
	new EmailSender().enviarEmail("rechazador@excusas.com",excusa.getEmpleado().getEmail() , "rechazao", "Excusa rechazada: necesitamos pruebas contundentes");
	}

	@Override
	public void setSiguiente(ManejadorExcusas siguiente) {

	}

	@Override
	public boolean puedeManejar(Excusa excusa) {
		return true;
	}

	@Override
	public boolean isGerenteRRHH() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRecepcionista() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSupervisorArea() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEncargadoDefault() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCEO() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ManejadorExcusas getSiguiente() {
		// TODO Auto-generated method stub
		return null;
	}

}
