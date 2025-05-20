package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.abstractas.Excusa;
import com.santifalcon.tp1.excusa.abstractas.InverosimilExcusa;
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


	
}
