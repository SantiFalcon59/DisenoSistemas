package com.santifalcon.tp1.empleado.encargado.modoaccion;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;

public class ModoProductivo implements ModoAccion {

	@Override
	public void evaluar(Encargado encargado, IExcusa excusa) {	
		new EmailSender().enviarEmail("cto@excusas.com.ar", encargado.getEmail(), "produccion", "mira lo que dijo este wey");
		encargado.realizarAccion(excusa);
	}

}
