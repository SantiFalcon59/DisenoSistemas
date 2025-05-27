package com.santifalcon.tp1.excusa.subtipos;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.ManejadorExcusas;

public class TrivialExcusa extends Excusa {

	public TrivialExcusa(Empleado empleado,String mensaje) {
		super(empleado,mensaje);
	}
	
	@Override
	public void accion(Encargado encargado) {
		new EmailSender().enviarEmail(encargado.getEmail(),
				getEmpleado().getEmail(),"motivo demora",
				"la licencia fue aceptada");
	}
	
	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isRecepcionista();
	}
	

}
