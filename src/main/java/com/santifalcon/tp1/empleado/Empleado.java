package com.santifalcon.tp1.empleado;

import com.santifalcon.tp1.empleado.interfaces.IEmpleado;

public class Empleado implements IEmpleado {

	private String nombre;
	private String email;
	private int legajo;
	
	public Empleado(String nombre, String email,int legajo) {
		this.nombre = nombre;
		this.email = email;
		this.legajo = legajo;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public int getLegajo() {
		return legajo;
	}


	

	
}
