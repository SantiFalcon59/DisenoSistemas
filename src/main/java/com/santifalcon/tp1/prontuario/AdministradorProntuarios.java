package com.santifalcon.tp1.prontuario;

import java.util.ArrayList;
import java.util.List;

public class AdministradorProntuarios {

	private List<Prontuario> prontuarios;
	
	private AdministradorProntuarios administradorProntuarios;
	
	private AdministradorProntuarios() {
		this.prontuarios = new ArrayList<Prontuario>();
	}
	
	public AdministradorProntuarios getInstance() {
		if (this.administradorProntuarios==null) {
			this.administradorProntuarios = new AdministradorProntuarios();
		}
		return this.administradorProntuarios;
	}
	
	public void agregarProntuario(Prontuario prontuario) {
		this.prontuarios.add(prontuario);
	}
	
	public void removerProntuario(Prontuario prontuario) {
		this.prontuarios.remove(prontuario);
	}
	
	
	
}
