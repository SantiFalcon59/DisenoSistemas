package com.santifalcon.tp1.modoaccion;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Encargado;
import com.santifalcon.tp1.excusa.abstractas.Excusa;

public class ModoProductivo implements ModoAccion {

	@Override
	public void accionar(Encargado encargado, Excusa excusa) {	
		new EmailSender().enviarEmail("cto@excusas.com.ar", encargado.getEmail(), "produccion", "mira lo que dijo este wey");
		if (encargado.puedeManejar(excusa)) {
			excusa.accion(encargado);
		} else {
			encargado.pasar(excusa);
		}
		
		
	}

}
