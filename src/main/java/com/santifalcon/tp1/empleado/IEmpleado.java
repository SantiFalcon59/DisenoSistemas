package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.empleado.encargado.lineaencargados.ILineaDeManejadoresDeExcusas;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;
import com.santifalcon.tp1.excusa.tipoexcusa.ITipoExcusa;

public interface IEmpleado {

	public String getNombre();
	public String getEmail();
	public int getLegajo();
	IExcusa presentarExcusa(String motivo, ITipoExcusa tipoExcusa, ILineaDeManejadoresDeExcusas manejadores);

}
