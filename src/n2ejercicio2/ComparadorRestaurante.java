package n2ejercicio2;

import n2ejercicio1.Restaurante;

public class ComparadorRestaurante extends Restaurante implements Comparable<Restaurante> {

	public ComparadorRestaurante(String nombre, int puntuacion) {
		super(nombre, puntuacion);
	}

	@Override
	public int compareTo(Restaurante o) {
		// TODO Auto-generated method stub
		
		//Casting para comparar los objetos this. y o;
		ComparadorRestaurante restaurante = (ComparadorRestaurante) o;
		
		int resultado = super.getNombre().compareToIgnoreCase(restaurante.getNombre());
		
		if(resultado < 0) {
			
			return -1;
			
		}else if(resultado > 0) {
			
			return 1;
			
		}else {
			
			if(super.getPuntuacion() > restaurante.getPuntuacion()) {
				
				return -1;
				
			}else if(super.getPuntuacion() < restaurante.getPuntuacion()) {
				
				return 1;
			}else {
				
				return 0;
			}	
		}
	}
}
