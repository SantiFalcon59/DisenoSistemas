package com.santifalcon.tp1.prontuario.interfaces;


public interface Observable<K,V> {

	public void agregarObserver(K obs);
	public void removeObserver(K obs);
	public void notificarAll(V prontuario);
	public void notificar(K obs, V prontuario);
	
}
