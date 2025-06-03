package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoCuidarFamiliarExcusa extends TipoExcusa {

	@Override
	public void accion(Encargado encargado, Empleado empleado) {
		new EmailSender().enviarEmail(encargado.getEmail(),
				empleado.getEmail(),"tas bn¿",
				"tu familia ta bien?");
	}
	
	

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isSupervisorArea();
	}

}
