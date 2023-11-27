package n2ejercicio1;

public class Restaurante {

	private String nombre;
	private int puntuacion;

	public Restaurante(String nombre, int puntuacion) {

		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Restaurante [nombre=" + this.nombre + ", puntuacion=" + this.puntuacion + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + puntuacion;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Restaurante) {

			Restaurante restaurante = (Restaurante) obj;

			if ((this.nombre == restaurante.nombre) && (this.puntuacion == restaurante.puntuacion)) {

				return true;
				
			} else {
				
				return false;
			}

		} else {

			return false;
		}

	}

}
