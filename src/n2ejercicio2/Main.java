package n2ejercicio2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import n2ejercicio1.Restaurante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Restaurante> restaurantes = new HashSet<Restaurante>();
		
		restaurantes.add(new ComparadorRestaurante("ccccc", 100));
		restaurantes.add(new ComparadorRestaurante("bbbbb", 90));
		restaurantes.add(new ComparadorRestaurante("aaaaa", 100));
		restaurantes.add(new ComparadorRestaurante("aaaaa", 90));
		restaurantes.add(new ComparadorRestaurante("eeeee", 90));
		
		 Set<Restaurante> treerest = new TreeSet<Restaurante>(restaurantes);
		
		for(Restaurante restaurante :  treerest)
			
		System.out.println( restaurante);
	}

}