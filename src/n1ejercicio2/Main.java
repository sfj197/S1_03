package n1ejercicio2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> lista1 = new LinkedList<Integer>();
		
		//Se ponen en el orden introducido, y eficiente al ordenar.
		//No eficiente al agregar.
		
		lista1.add(10);
		lista1.add(9);
		lista1.add(3);
		lista1.add(1);
		lista1.add(8);
		lista1.add(2);
		
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		
		ListIterator<Integer> it = lista1.listIterator();
		
		while(it.hasNext()) {
			
			int numero = it.next().intValue();
			
			System.out.print(numero + ",");
		}
		
		System.out.println("\n");
		
		//El iterator esta al final de la lista.Tiro hacia atras y agrego en lista2.
		
		if(!it.hasNext()) {
			
			for(Integer numero : lista1) {
				
				numero = it.previous();
				
				lista2.add(numero);
				
			}
			
			for(Integer numero : lista2) {
				
				System.out.print(numero + ",");
			}	
			
			
			//Meter lista 1 en lista 2.
			ListIterator<Integer> it1 = lista1.listIterator();
			
			while(it1.hasNext()) {
				
				int numero = it1.next().intValue();
				
				lista2.add(numero);
				
			}
			
			System.out.println("\n" + lista2);
		}
	}
}
