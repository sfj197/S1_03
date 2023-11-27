package n2ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Restaurante> restaurantes = new HashSet<Restaurante>();
		
		restaurantes.add(new Restaurante("Bully", 100));
		restaurantes.add(new Restaurante("Kansas", 90));
		restaurantes.add(new Restaurante("Michelin", 100));
		restaurantes.add(new Restaurante("Montoro", 90));
		restaurantes.add(new Restaurante("Bully", 90));
		
		System.out.println(restaurantes);
	}

}
