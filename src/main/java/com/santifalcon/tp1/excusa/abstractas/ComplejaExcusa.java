package com.santifalcon.tp1.excusa.abstractas;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.Encargado;

public class ComplejaExcusa extends Excusa {

	public ComplejaExcusa(Empleado empleado,String mensaje) {
		super(empleado,mensaje);
	}

	@Override
	public void accion(Encargado encargado) {
		
	}

}
