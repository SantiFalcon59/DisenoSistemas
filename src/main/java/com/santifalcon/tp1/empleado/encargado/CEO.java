package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.prontuario.AdministradorProntuarios;
import com.santifalcon.tp1.prontuario.Prontuario;
import com.santifalcon.tp1.prontuario.interfaces.Observer;

public class CEO extends Encargado implements Observer {
	
	public CEO(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
		AdministradorProntuarios.getInstance().agregarObserver(this);
	}



	@Override
	public void update(Prontuario prontuario) {
		new EmailSender().enviarEmail(prontuario.getEncargado().getEmail(),this.getEmail(),"nuevo prontario", "prontuario para: " + prontuario.getEmpleado().getNombre());
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
		return true;
	}



	@Override
	public void realizarAccion(Excusa excusa) {
		this.enviarEmail(getEmail(), excusa.getEmpleado().getEmail(), "respuesta", "aprobado por creatividad");
		Prontuario prontuario = new Prontuario(excusa.getEmpleado(), this, excusa);
		AdministradorProntuarios.getInstance().agregarProntuario(prontuario);
	}






	
}
