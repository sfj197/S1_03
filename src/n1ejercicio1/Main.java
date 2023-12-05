package n1ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Month>months = new ArrayList<Month>(11);
		
		months.add(new Month("January"));
		months.add(new Month("February"));
		months.add(new Month("March"));
		months.add(new Month("April"));
		months.add(new Month("May"));
		months.add(new Month("June"));
		months.add(new Month("July"));
		months.add(new Month("September"));
		months.add(new Month("Octuber"));
		months.add(new Month("November"));
		months.add(new Month("December"));
		
		System.out.println("Comprobamos si Agosto se coloca en el indice indicado.");
		months.add(7,new Month("August"));
		
		for(Month month : months) {
			
			System.out.print(month + ",");	
		}
		
		System.out.println();
		//Transformamos a Set.
		Set<Month> months1 = new HashSet<Month>(months);
		
		months1.add(new Month("August"));

		System.out.println("En una coleccion Set,comprobamos si se duplica.");
		
		for(Month month:months1) {
			System.out.print(month + ",");
			
		}
		System.out.println();
		
		//Creamos objeto Iterator.
			
		Iterator<Month>it = months1.iterator();
		
		while(it.hasNext()) {
			
			String nameMonth = it.next().getName();
			
			System.out.print(nameMonth + ",");
		}
	}
}
