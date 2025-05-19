package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.TipoExcusa;
import com.santifalcon.tp1.modoaccion.ModoAccion;

public class GerenteRRHH extends Encargado {

	public GerenteRRHH(String nombre, String email, int legajo,ModoAccion modoAccion) {
		super(nombre, email, legajo,modoAccion);
	}
	
    @Override
	public boolean puedeManejar(Excusa excusa) {
        return excusa.getTipoExcusa().equals(TipoExcusa.INVEROSIMIL);
    }

	@Override
	public void manejarExcusa(Excusa excusa) {
		new EmailSender().enviarEmail(this.getEmail(),
				excusa.getEmpleado().getEmail(),"motivo demora",
				"la licencia fue aceptada");
	}



}
