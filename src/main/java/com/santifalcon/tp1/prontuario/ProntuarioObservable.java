package com.santifalcon.tp1.prontuario;

import java.util.ArrayList;
import java.util.List;

import com.santifalcon.tp1.prontuario.interfaces.Observable;
import com.santifalcon.tp1.prontuario.interfaces.Observer;

public class ProntuarioObservable implements Observable<Observer,Prontuario> {
 
	private List<Observer> observers;
	
	public ProntuarioObservable() {
		this.observers = new ArrayList<Observer>();
		
	}
	
	@Override
	public void agregarObserver(Observer obs) {
		System.out.println("OBSERVER AGREGADO");
		this.observers.add(obs);
	}
	
	@Override
	public void removeObserver(Observer obs) {
		this.observers.remove(obs);
	}
	
	@Override
	public void notificarAll(Prontuario prontuario) {
		for (Observer o : this.observers) {
			notificar(o,prontuario);
		}
	}
	
	@Override
	public void notificar(Observer obs, Prontuario prontuario) {
		obs.update(prontuario);
	}
}
