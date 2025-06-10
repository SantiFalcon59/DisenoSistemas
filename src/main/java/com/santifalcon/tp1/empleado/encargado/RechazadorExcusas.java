package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class RechazadorExcusas implements ManejadorExcusas {


	@Override
	public void manejarExcusa(IExcusa excusa) {
		realizarAccion(excusa);
		
	}

	@Override
	public void pasarExcusa(IExcusa excusa) {
		
	}

	@Override
	public void realizarAccion(IExcusa excusa) {
	new EmailSender().enviarEmail("rechazador@excusas.com",excusa.getEmpleado().getEmail() , "rechazao", "Excusa rechazada: necesitamos pruebas contundentes");
	}

	@Override
	public void setSiguiente(ManejadorExcusas siguiente) {

	}

	@Override
	public boolean puedeManejar(IExcusa excusa) {
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
