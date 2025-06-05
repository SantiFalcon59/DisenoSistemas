package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.excusa.Excusa;

public class Recepcionista extends Encargado {

	public Recepcionista(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
	}
	
    @Override
	public boolean puedeManejar(Excusa excusa) {
    	System.out.println("Evaluando excusa por recepcionista");
     return excusa.puedeSerManejadaPor(this);
    }

	@Override
	public boolean isGerenteRRHH() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRecepcionista() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isSupervisorArea() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEncargadoDefault() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCEO() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void realizarAccion(Excusa excusa) {
		new EmailSender().enviarEmail(getEmail(),
				excusa.getEmpleado().getEmail(),"motivo demora",
				"la licencia fue aceptada");
	}

}
