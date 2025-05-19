package com.santifalocn.tp1.empleado;

import com.santifalocn.tp1.excusa.Excusa;
import com.santifalocn.tp1.modoaccion.ModoAccion;

public interface IEncargado {

	public ModoAccion getModoAccion();
	public void pasar(Excusa excusa);
}
