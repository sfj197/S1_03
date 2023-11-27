package n1ejercicio3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Juego {
	private LeerArchivo archivo;
	private HashMap<String, String> lista;

	public Juego(LeerArchivo archivo) throws FileNotFoundException {

		this.archivo = archivo;
		
		try {
			this.lista = archivo.leerArchivo();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lista no encontrada");
		}	

	}
	
	public void comienzoJuego() throws IOException {
		String nombre = "";
		int puntos = 0;
		String paisAleatorio = "";
		String capitalAleatoria = "";
		String respuesta;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		nombre = entrada.next();
			
		for(int i = 0; i < 10 ; i++) {
			paisAleatorio  = obtenerPais();
			capitalAleatoria = lista.get(paisAleatorio);	
			
			System.out.println("Dime la capital de: " + paisAleatorio);
			respuesta = entrada.next();
			
			if(respuesta.equalsIgnoreCase(capitalAleatoria)) {
				
				System.out.println("Respuesta correcta");
				puntos++;
			}else {
				
				System.out.println("La respuesta no es correcta, la capital es:" +
				capitalAleatoria);
			}
			System.out.println("puntos: " + puntos);
					
		}try {
		archivo.puntuacionUsuario(nombre, puntos);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se encuentra archivo escritura");
		}
		
		entrada.close();
			
	}

	public String  obtenerPais() {

		Random r = new Random();
		int num = r.nextInt(lista.size());

		return (String) lista.keySet().toArray()[num];

	}

}
