package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.subtipos.InverosimilExcusa;
import com.santifalcon.tp1.modoaccion.ModoAccion;
import com.santifalcon.tp1.prontuario.Prontuario;
import com.santifalcon.tp1.prontuario.ProntuarioObserver;

public class CEO extends Encargado implements ProntuarioObserver {

	public CEO(String nombre, String email, int legajo, ModoAccion modoAccion) {
		super(nombre, email, legajo,modoAccion);
	}

	
	
	  @Override
		public boolean puedeManejar(Excusa excusa) {
	        return excusa instanceof InverosimilExcusa;
	    }


	@Override
	public void update(Prontuario prontuario) {
		new EmailSender().enviarEmail(getEmail(),prontuario.getEncargado().getEmail(),"nuevo prontario", "prontuario para: " + prontuario.getEmpleado().getNombre());
	}




	
}
