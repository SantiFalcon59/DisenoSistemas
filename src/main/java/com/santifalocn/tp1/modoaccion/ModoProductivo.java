package com.santifalocn.tp1.modoaccion;

import com.santifalocn.tp1.EmailSender;
import com.santifalocn.tp1.empleado.Encargado;
import com.santifalocn.tp1.excusa.Excusa;

public class ModoProductivo implements ModoAccion {

	@Override
	public void accionar(Encargado encargado, Excusa excusa) {	
		new EmailSender().enviarEmail("cto@excusas.com.ar", encargado.getEmail(), "produccion", "mira lo que dijo este wey");
		if (encargado.puedeManejar(excusa)) {
			encargado.manejarExcusa(excusa);
		} else {
			encargado.pasar(excusa);
		}
		
		
	}

}
