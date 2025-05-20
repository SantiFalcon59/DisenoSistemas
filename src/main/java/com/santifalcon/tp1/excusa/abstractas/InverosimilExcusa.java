package com.santifalcon.tp1.excusa.abstractas;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.Encargado;

public class InverosimilExcusa extends Excusa {

	public InverosimilExcusa(Empleado empleado,String mensaje) {
		super(empleado,mensaje);
	}

	@Override
	public void accion(Encargado encargado) {
		new EmailSender().enviarEmail(encargado.getEmail(),
				getEmpleado().getEmail(),"respuesta",
				"aprobado por creatividad");
	}

}
