package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class RechazadorExcusas implements ManejadorExcusas {


	@Override
	public void manejarExcusa(Excusa excusa) {
		realizarAccion(excusa);
		
	}

	@Override
	public void pasarExcusa(Excusa excusa) {
		
	}

	@Override
	public void realizarAccion(Excusa excusa) {
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
		return false;
	}

	@Override
	public boolean isRecepcionista() {
		return false;
	}

	@Override
	public boolean isSupervisorArea() {
		return false;
	}

	@Override
	public boolean isEncargadoDefault() {
		return false;
	}

	@Override
	public boolean isCEO() {
		return false;
	}

	@Override
	public ManejadorExcusas getSiguiente() {
		return null;
	}

}
