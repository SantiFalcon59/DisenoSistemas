package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.prontuario.AdministradorProntuarios;
import com.santifalcon.tp1.prontuario.Prontuario;
import com.santifalcon.tp1.prontuario.interfaces.Observer;

public class CEO extends Encargado implements Observer {

	private boolean notificado;
	
	
	public CEO(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
		this.notificado = false;
	}



	@Override
	public void update(Prontuario prontuario) {
		this.notificado = true;
		new EmailSender().enviarEmail(getEmail(),prontuario.getEncargado().getEmail(),"nuevo prontario", "prontuario para: " + prontuario.getEmpleado().getNombre());
	}

	public boolean isNotificado() {
		return this.notificado;
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
		return true;
	}



	@Override
	public void realizarAccion(Excusa excusa) {
		this.enviarEmail(getEmail(), excusa.getEmpleado().getEmail(), "respuesta", "aprobado por creatividad");
		Prontuario prontuario = new Prontuario(excusa.getEmpleado(), this, excusa);
		AdministradorProntuarios.getInstance().agregarProntuario(prontuario);
	}






	
}
