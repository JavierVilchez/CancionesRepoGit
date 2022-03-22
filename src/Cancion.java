
public class Cancion {
/**
 * Clase que muestra canciones , duracion y grupos
 * @author Javier
 * @version 2022
 */
	private String titulo; //Variable donde guardará en titulo de la canción
	private String grupo;  //Variable que almacena el grupo que creó la canción
	private int duracion;  //Variable int que guarda la duracion de cada cancion
	private boolean sonando;  //Variable booleana que guarda si esta sonando o no

	// Definimos los constructores

	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}

	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}

	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}

	//Booleano de si esta sonando o no
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}

	//Boolean de si esta sonando que pare
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}

	//Booleano que comprueba si es la misma cancion
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}

	//Método para hayar la cancion con mayor duración
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0; //Variable donde se almacena por cada vuelta cada duracion
		int max = 0;//Variable donde se iran guardando el maximo que se registre
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;//Devuelve la cancion con mayor duracion

	}

	//Recorre las canciones
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override 
	public String toString() { 
	return "Datos de la canción [titulo=" + titulo + ", autor=" +  grupo + ", duracion=" + duracion + ", sonando=" + sonando 
	+ "]"; 
	}

}
