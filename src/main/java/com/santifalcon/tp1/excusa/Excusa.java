package com.santifalcon.tp1.excusa;


import com.santifalcon.tp1.empleado.IEmpleado;
import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;
import com.santifalcon.tp1.excusa.interfaces.ManejadorExcusas;
import com.santifalcon.tp1.excusa.tipoexcusa.ITipoExcusa;

public class Excusa implements IExcusa {

	private IEmpleado empleado;
	private String mensaje;
	private ITipoExcusa tipoExcusa;
	
	public Excusa(IEmpleado empleado,String mensaje, ITipoExcusa tipoExcusa) {
		this.empleado = empleado;
		this.tipoExcusa = tipoExcusa;
		this.mensaje = mensaje;
	}
	
	@Override
	public void evaluar(Encargado encargado) {
		tipoExcusa.accion(encargado,this);
	}
	
	
	@Override
	public IEmpleado getEmpleado() {
		return this.empleado;
	}
	
	@Override
	public String getMensaje() {
		return this.mensaje;
	}
	
	public ITipoExcusa getTipoExcusa() {
		return this.tipoExcusa;
	}
	
	@Override
	public boolean puedeSerManejadaPor(ManejadorExcusas manejadorExcusas) {
		return this.tipoExcusa.puedeSerManejadaPor(manejadorExcusas);
	}
	


	@Override
	public String[] getEmailContenido(IEmpleado empleado) {
		return this.tipoExcusa.getEmailContenido(empleado);
	}
	
	
}
