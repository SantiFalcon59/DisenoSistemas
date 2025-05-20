package com.santifalcon.tp1.prontuario;

import com.santifalcon.tp1.EmailSender;

public interface ProntuarioObserver  {


	 default  void update(Prontuario prontuario) {
	new EmailSender().enviarEmail(getEmail(),prontuario.getEncargado().getEmail(),"nuevo prontario", "prontuario para: " + prontuario.getEmpleado().getNombre());
	}
}
