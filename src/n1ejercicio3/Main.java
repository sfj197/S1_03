package n1ejercicio3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LeerArchivo primero = new LeerArchivo();
		
		Juego nuevo = new Juego(primero);
		nuevo.comienzoJuego();
		
		

	}

}
