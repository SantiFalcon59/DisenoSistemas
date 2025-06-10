package com.santifalcon.tp1.empleado.encargado.modoaccion;

import com.santifalcon.tp1.empleado.encargado.Encargado;
import com.santifalcon.tp1.excusa.interfaces.IExcusa;

public interface ModoAccion {
public void evaluar(Encargado encargado, IExcusa excusa);
}
