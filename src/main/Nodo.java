package main;

import java.util.ArrayList;

public class Nodo {
	
	private String contenido;
	private ArrayList<Nodo> nodosHijos;
	
	public Nodo(String contenido) {
		this.contenido = contenido;
		this.nodosHijos = new ArrayList<Nodo>();
	}

	public String getContenido() {
		return this.contenido;
	}
	
	public ArrayList<Nodo> getNodosHijos() {
		return this.nodosHijos;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public void setNodoHijo(Nodo nodoHijo) {
		this.nodosHijos.add(nodoHijo);
	}
	
	public boolean tieneNodosHijos() {
		ArrayList<Nodo> nodosHijos = new ArrayList<Nodo>();
		nodosHijos = this.getNodosHijos();
		if(nodosHijos.size() > 0) {
			return true;
		}else {
			return false;
		}
	}
}
