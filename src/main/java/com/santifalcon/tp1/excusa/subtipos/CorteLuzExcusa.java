package com.santifalcon.tp1.excusa.subtipos;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.Encargado;
import com.santifalcon.tp1.excusa.ManejadorExcusas;

public class CorteLuzExcusa extends ModeradaExcusa {

	public CorteLuzExcusa(Empleado empleado,String mensaje) {
		super(empleado,mensaje);
	}

	@Override
	public void accion(Encargado encargado) {
		new EmailSender().enviarEmail(encargado.getEmail(),
				"EDESUR@mailfake.com.ar","consulta",
				"la persona " + getEmpleado().getNombre() + " tiene luz?");
	}

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isGerenteRRHH();
	}

}
