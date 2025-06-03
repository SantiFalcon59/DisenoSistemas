package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.tipoexcusa.TipoExcusa;

public interface IEmpleado {

	public String getNombre();
	public String getEmail();
	public int getLegajo();
	Excusa generarExcusa(String motivo, TipoExcusa tipoExcusa);

}
