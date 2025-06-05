package com.santifalcon.tp1.excusa.tipoexcusa;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;

public class TipoCuidarFamiliarExcusa extends TipoExcusa {

	@Override
	public void accion(Encargado encargado, Excusa excusa) {
		new EmailSender().enviarEmail(encargado.getEmail(),
				excusa.getEmpleado().getEmail(),"tas bn¿",
				"tu familia ta bien?");
	}
	
	

	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return manejadorExcusas.isSupervisorArea();
	}



	@Override
	public String[] getEmailContenido(Empleado empleado) {
		String[] asuntocontenido = {"tas bien¿","Nos hemos enterado de los problemas en tu familia, como tas?"
				,empleado.getEmail()};
		return asuntocontenido;
	
	}

}
