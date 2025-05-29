package com.santifalcon.tp1.prontuario;

import java.util.ArrayList;
import java.util.List;

import com.santifalcon.tp1.prontuario.interfaces.Observable;
import com.santifalcon.tp1.prontuario.interfaces.ProntuarioObserver;

public class ProntuarioObservable implements Observable<ProntuarioObserver,Prontuario> {
 
	private List<ProntuarioObserver> observers;
	
	public ProntuarioObservable() {
		this.observers = new ArrayList<ProntuarioObserver>();
		
	}
	
	@Override
	public void agregarObserver(ProntuarioObserver obs) {
		this.observers.add(obs);
	}
	
	@Override
	public void removeObserver(ProntuarioObserver obs) {
		this.observers.remove(obs);
	}
	
	@Override
	public void notificarAll(Prontuario prontuario) {
		for (ProntuarioObserver o : this.observers) {
			notificar(o,prontuario);
		}
	}
	
	@Override
	public void notificar(ProntuarioObserver obs, Prontuario prontuario) {
		obs.update(prontuario);
	}
}
