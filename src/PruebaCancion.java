
public class PruebaCancion {

	
public static void main(String[] args) {
		
	
	//Asignar los datos de las canciones
		Cancion cancionPrueba = new Cancion();
		//Syso de prueba de el objeto creado
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion ("TituloCancion", "The White Buffalo ",220, false );
		Cancion quintaCancion = new Cancion ("TituloCancion2", "The White Buffalo 2 ",240, false );
		//Condicion de que si se reproduce la cancion que devuelva el titulo y "esta sonando"
		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		//Condicion de que si se para la cancion que salga el nombre de la cancion + "stop"
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + " stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion,cuartaCancion,quintaCancion };
		
		
		//Mostrar el titulo y los autores de las canciones y las canciones que sonarán
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}

		//Método de la siguiente cancion que se va ha escuchar
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

//Método que te dice que cancion es la mas larga
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}


	
	//Método que muestra Canciones, autor 
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}

		
}
