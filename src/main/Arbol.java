package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Arbol {

	private HashMap<String, Integer> ocurrenciasNodos = new HashMap<String, Integer>();

	public Arbol() {
	}

	public void recorridoRecursivo(Nodo nodoRaiz) {
		contarOcurrencias(nodoRaiz.getContenido());
		ArrayList<Nodo> nodosHijos = nodoRaiz.getNodosHijos();
		for (int i = 0; i < nodosHijos.size(); i++) {
			Nodo nodo = nodosHijos.get(i);
			if (nodo.tieneNodosHijos()) {
				recorridoRecursivo(nodo);
			} else {
				contarOcurrencias(nodo.getContenido());
			}
		}
	}

	public void contarOcurrencias(String contenido) {
		if (!ocurrenciasNodos.containsKey(contenido)) {
			ocurrenciasNodos.put(contenido, 1);
		} else {
			ocurrenciasNodos.put(contenido, ocurrenciasNodos.get(contenido) + 1);
		}
	}

	public void listarOcurrencias() {
		Iterator it = ocurrenciasNodos.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
