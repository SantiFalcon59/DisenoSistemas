package com.santifalcon.tp1;

public class EmailSender {

	public void enviarEmail(String origen, String destino, String asunto, String contenido) {
		System.out.println("Mail enviado desde: " + origen + " para " + destino + ", asunto: "+ asunto + " contenido: " + contenido );
	}
}
