package com.santifalcon.tp1.excusa;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;
import com.santifalcon.tp1.excusa.tipoexcusa.TipoExcusa;

public class Excusa implements IExcusa {

	private Empleado empleado;
	private String mensaje;
	private TipoExcusa tipoExcusa;
	
	public Excusa(Empleado empleado,String mensaje, TipoExcusa tipoExcusa) {
		this.empleado = empleado;
		this.tipoExcusa = tipoExcusa;
	}
	
	@Override
	public void accion(Encargado encargado) {
		tipoExcusa.accion(encargado,this.empleado);
	}
	
	
	@Override
	public Empleado getEmpleado() {
		return this.empleado;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	
	public TipoExcusa getTipoExcusa() {
		return this.tipoExcusa;
	}


	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return this.tipoExcusa.puedeSerManejadaPor(manejadorExcusas);
	}
	
	
}
