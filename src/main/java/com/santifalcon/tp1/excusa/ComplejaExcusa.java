package com.santifalcon.tp1.excusa;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public  class ComplejaExcusa extends Excusa {

	public ComplejaExcusa(Empleado empleado,String mensaje) {
		super(empleado,mensaje);
	}

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isGerenteRRHH();
	}

	@Override
	public void accion(Encargado encargado) {
		new EmailSender().enviarEmail(encargado.getEmail(),
					this.getEmpleado().getEmail(),"excusa",
				"aprobado");
		
	}

}
