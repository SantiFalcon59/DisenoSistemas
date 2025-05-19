package com.santifalocn.tp1.empleado;

import com.santifalocn.tp1.EmailSender;
import com.santifalocn.tp1.excusa.Excusa;
import com.santifalocn.tp1.excusa.TipoExcusa;
import com.santifalocn.tp1.modoaccion.ModoAccion;

public class Recepcionista extends Encargado {

	public Recepcionista(String nombre, String email, int legajo,ModoAccion modoAccion) {
		super(nombre, email, legajo,modoAccion);
	}
	
    @Override
	public boolean puedeManejar(Excusa excusa) {
        return excusa.getTipoExcusa().equals(TipoExcusa.QUEDARSE_DORMIDO) || excusa.getTipoExcusa().equals(TipoExcusa.PERDIDA_TRANSPORTE);
    }

	@Override
	public void manejarExcusa(Excusa excusa) {
		new EmailSender().enviarEmail(this.getEmail(),
				excusa.getEmpleado().getEmail(),"motivo demora",
				"la licencia fue aceptada");
	}



}
