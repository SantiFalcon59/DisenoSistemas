package com.santifalcon.tp1.empleado.encargado;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.prontuario.Prontuario;
import com.santifalcon.tp1.prontuario.interfaces.Observer;

public class CEO extends Encargado implements Observer {

	public CEO(String nombre, String email, int legajo) {
		super(nombre, email, legajo);
	}



	@Override
	public void update(Prontuario prontuario) {
		new EmailSender().enviarEmail(getEmail(),prontuario.getEncargado().getEmail(),"nuevo prontario", "prontuario para: " + prontuario.getEmpleado().getNombre());
	}



	@Override
	public boolean isGerenteRRHH() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isRecepcionista() {
		// TODO Auto-generated method stub
		return false;
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
		return true;
	}



	@Override
	public void realizarAccion(Empleado empleado) {
		new EmailSender().enviarEmail(getEmail(),
				empleado.getEmail(),"respuesta",
				"aprobado por creatividad");
		
	}




	
}
