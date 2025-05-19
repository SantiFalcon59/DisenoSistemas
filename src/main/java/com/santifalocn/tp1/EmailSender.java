package com.santifalocn.tp1;

public class EmailSender {

	public void enviarEmail(String destino, String origen, String asunto, String contenido) {
		System.out.println("Mail enviado desde: " + origen + " para " + destino + ", asunto: "+ asunto + " contenido: " + contenido );
	}
}
