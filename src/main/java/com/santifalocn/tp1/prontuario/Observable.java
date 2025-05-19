package com.santifalocn.tp1.prontuario;


public interface Observable<K,V> {

	public void agregarObserver(K obs);
	public void removeObserver(K obs);
	public void notificarAll(Prontuario prontuario);
	public void notificar(K obs, V prontuario);
	
}
