package com.santifalcon.tp1.prontuario;

import java.util.ArrayList;
import java.util.List;


public class AdministradorProntuarios extends ProntuarioObservable  {

	private List<Prontuario> prontuarios;
	
	private static AdministradorProntuarios administradorProntuarios;
	
	private AdministradorProntuarios() {
		this.prontuarios = new ArrayList<Prontuario>();
	}
	
	public static AdministradorProntuarios getInstance() {
		if (administradorProntuarios==null) {
			administradorProntuarios = new AdministradorProntuarios();
		}
		return administradorProntuarios;
	}
	
	public void agregarProntuario(Prontuario prontuario) {
		this.notificarAll(prontuario);
		this.prontuarios.add(prontuario);
	}
	
	public void removerProntuario(Prontuario prontuario) {
		this.prontuarios.remove(prontuario);
	}

	public List<Prontuario> getProntuarios() {
		return this.prontuarios;
	}
	
	

	
	
	
}
