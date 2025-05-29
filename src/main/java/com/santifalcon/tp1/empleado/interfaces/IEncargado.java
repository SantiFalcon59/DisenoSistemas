package com.santifalcon.tp1.empleado.interfaces;
import com.santifalcon.tp1.modoaccion.ModoAccion;

public interface IEncargado {

	public ModoAccion getModoAccion();
	public void modoNormal();
	public void modoVago();
	public void modoProductivo();
}
