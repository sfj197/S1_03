package n1ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.HashMap;

public class LeerArchivo {

	public HashMap<String, String> leerArchivo() throws FileNotFoundException {

		HashMap<String, String> lista = new HashMap<String, String>();

		File countries = null;
		FileReader fr = null;
		BufferedReader br = null;
		String[] palabras = null;
		String linea;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			countries = new File("C:\\Users\\Jorge\\eclipse-workspace\\S1_03\\src\\n1ejercicio3\\countries.txt");
			fr = new FileReader(countries);
			br = new BufferedReader(fr);

			System.out.println("Fichero encontrado.");

			// Lectura del fichero(linea a linea)

			do {

				linea = br.readLine();// Con buffered leemos linea a linea.
				if (linea != null) {
					palabras = linea.split(" ");// Pasamos al array cada linea partida en dos parametros con separador
												// espacio.

				}

				lista.put(palabras[0], palabras[1]);// Transformamos los dos parametros al HashMap la llave y el valor .

			} while (linea != null);

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("El fichero no se encuentra");
		}

		return lista;
	}

	public void puntuacionUsuario(String nombreUser, int puntos) throws IOException {

		FileWriter puntuacion = null;
		BufferedWriter bw = null;

		try {
			puntuacion = new FileWriter(
					"C:\\Users\\Jorge\\eclipse-workspace\\S1_03\\src\\n1ejercicio3\\puntuacion.txt");
			bw = new BufferedWriter(puntuacion);

			bw.write(nombreUser + " : " + puntos + " puntos.");
			bw.flush();// vaciamos buffered

		} catch (Exception e) {

			System.out.println("Fichero no encontrado");
		}
		bw.close();
	}

}
