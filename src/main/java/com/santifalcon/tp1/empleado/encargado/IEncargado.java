package com.santifalcon.tp1.empleado.encargado;
import com.santifalcon.tp1.empleado.encargado.modoaccion.ModoAccion;

public interface IEncargado {

	public ModoAccion getModoAccion();
	public void modoNormal();
	public void modoVago();
	public void modoProductivo();
	public void enviarEmail(String origen, String destino, String asunto, String contenido);
	
}
