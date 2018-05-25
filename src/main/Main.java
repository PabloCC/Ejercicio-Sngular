package main;

public class Main {

	public static void main(String[] args) {
		Nodo nodoPadre = new Nodo("STF");
		Nodo nodo1 = new Nodo("AIT");
		Nodo nodo2 = new Nodo("QO");
		Nodo nodo3 = new Nodo("LP");
		Nodo nodo4 = new Nodo("AS");
		Nodo nodo5 = new Nodo("LP");
		Nodo nodo6 = new Nodo("AIT");
		Nodo nodo7 = new Nodo("STF");
		Nodo nodo8 = new Nodo("QO");
		Nodo nodo9 = new Nodo("STF");
		Nodo nodo10 = new Nodo("STF");
		
		//Creación del arbol
		nodoPadre.setNodoHijo(nodo1);
		nodoPadre.setNodoHijo(nodo2);
		nodoPadre.setNodoHijo(nodo3);
		nodo1.setNodoHijo(nodo4);
		nodo1.setNodoHijo(nodo5);
		nodo2.setNodoHijo(nodo6);
		nodo3.setNodoHijo(nodo7);
		nodo4.setNodoHijo(nodo8);
		nodo4.setNodoHijo(nodo9);
		nodo6.setNodoHijo(nodo10);

		System.out.println("Lista Parejas Resultado: \n");
		Arbol arbol = new Arbol();
		arbol.recorridoRecursivo(nodoPadre);
		arbol.listarOcurrencias();
	}
}
