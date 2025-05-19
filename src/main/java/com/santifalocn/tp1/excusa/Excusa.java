package com.santifalocn.tp1.excusa;

import com.santifalocn.tp1.empleado.Empleado;

public class Excusa  implements IExcusa {

	private Empleado empleado;
	private TipoExcusa tipoExcusa;
	
	public Excusa(Empleado empleado, TipoExcusa tipoExcusa) {
		this.empleado = empleado;
		this.tipoExcusa = tipoExcusa;
	}
	
	
	@Override
	public Empleado getEmpleado() {
		return this.empleado;
	}
	
	@Override
	public TipoExcusa getTipoExcusa() {
		return this.tipoExcusa;
	}
	
}
