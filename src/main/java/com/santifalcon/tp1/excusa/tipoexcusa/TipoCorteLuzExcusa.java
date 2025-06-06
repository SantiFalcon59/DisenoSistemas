package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoCorteLuzExcusa extends TipoModeradaExcusa {


	@Override
	public void accion(Encargado encargado,Excusa excusa) {
		new EmailSender().enviarEmail(encargado.getEmail(),
				"EDESUR@mailfake.com.ar","consulta",
				"la persona " + excusa.getEmpleado().getNombre() + " tiene luz?");
	}

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isSupervisorArea();
	}

	@Override
	public String[] getEmailContenido(Empleado empleado) {
		String[] asuntocontenido = {"se fue la luz?",empleado.getNombre() + 
				" nos ha dicho que no tiene luz, por favor validar","edesur@emailfake.com.ar"};
		return asuntocontenido;
	}
}
