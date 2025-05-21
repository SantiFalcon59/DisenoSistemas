package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.excusa.abstractas.Excusa;
import com.santifalcon.tp1.modoaccion.ModoAccion;

public interface IEncargado {

	public ModoAccion getModoAccion();
	public void pasar(Excusa excusa);
	public void modoNormal();
	public void modoVago();
	public void modoProductivo();
}
