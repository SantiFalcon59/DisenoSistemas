package com.santifalocn.tp1.empleado;

import com.santifalocn.tp1.EmailSender;
import com.santifalocn.tp1.excusa.Excusa;
import com.santifalocn.tp1.excusa.TipoExcusa;
import com.santifalocn.tp1.modoaccion.ModoAccion;

public class SupervisorArea extends Encargado {

	public SupervisorArea(String nombre, String email, int legajo,ModoAccion modoAccion) {
		super(nombre, email, legajo, modoAccion);
	}

	@Override
	public void manejarExcusa(Excusa excusa) {
			if (excusa.getTipoExcusa().equals(TipoExcusa.PERDIDA_SUMINISTRO) ) {
				new EmailSender().enviarEmail(this.getEmail(),
						"EDESUR@mailfake.com.ar","consulta",
						"la persona " + excusa.getEmpleado().getNombre() + " tiene luz?");
			} else if (excusa.getTipoExcusa().equals(TipoExcusa.CUIDADO_FAMILIAR)) {
				new EmailSender().enviarEmail(this.getEmail(),
						excusa.getEmpleado().getEmail(),"tas bien?",
						"tu familia ta bien?");
			}
		
	}

	@Override
	public boolean puedeManejar(Excusa excusa) {
		return excusa.getTipoExcusa().equals(TipoExcusa.PERDIDA_SUMINISTRO) || excusa.getTipoExcusa().equals(TipoExcusa.CUIDADO_FAMILIAR);
	}
}
