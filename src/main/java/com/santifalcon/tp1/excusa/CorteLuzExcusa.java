package com.santifalcon.tp1.excusa;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.excusa.abstractas.TrivialExcusa;

public class CorteLuzExcusa extends TrivialExcusa {

	public CorteLuzExcusa(Empleado empleado,String mensaje) {
		super(empleado,mensaje);
	}

}
