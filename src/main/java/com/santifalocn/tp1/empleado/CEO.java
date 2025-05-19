package com.santifalocn.tp1.empleado;

import com.santifalocn.tp1.EmailSender;
import com.santifalocn.tp1.excusa.Excusa;
import com.santifalocn.tp1.excusa.TipoExcusa;
import com.santifalocn.tp1.modoaccion.ModoAccion;
import com.santifalocn.tp1.prontuario.AdministradorProntuarios;
import com.santifalocn.tp1.prontuario.Prontuario;
import com.santifalocn.tp1.prontuario.ProntuarioObserver;

public class CEO extends Encargado implements ProntuarioObserver {

	private AdministradorProntuarios administradorProntuarios;
	public CEO(String nombre, String email, int legajo, ModoAccion modoAccion, AdministradorProntuarios administradorProntuarios) {
		super(nombre, email, legajo,modoAccion);
		this.administradorProntuarios = administradorProntuarios;
	}

	@Override
	public void manejarExcusa(Excusa excusa) {
			new EmailSender().enviarEmail(this.getEmail(),
					excusa.getEmpleado().getEmail(),"respuesta",
					"aprobado por creatividad");
			Prontuario prontuario = new Prontuario(excusa.getEmpleado(),this, excusa);
			this.administradorProntuarios.agregarProntuario(prontuario);
			this.administradorProntuarios.notificarAll(prontuario);
			
	}

	@Override
	public void update(Prontuario prontuario) {
	new EmailSender().enviarEmail(getEmail(),prontuario.getEncargado().getEmail(),"nuevo prontario", "prontuario para: " + prontuario.getEmpleado().getNombre());
	}
	
	
	  @Override
		public boolean puedeManejar(Excusa excusa) {
	        return excusa.getTipoExcusa().equals(TipoExcusa.INVEROSIMIL);
	    }


	
}
