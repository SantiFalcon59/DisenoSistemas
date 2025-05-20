package com.santifalcon.tp1.excusa.abstractas;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.Encargado;

public abstract class TrivialExcusa extends Excusa {

	public TrivialExcusa(Empleado empleado,String mensaje) {
		super(empleado,mensaje);
	}
	
	@Override
	public void accion(Encargado encargado) {
		new EmailSender().enviarEmail(encargado.getEmail(),
				getEmpleado().getEmail(),"motivo demora",
				"la licencia fue aceptada");
	}
	

}
