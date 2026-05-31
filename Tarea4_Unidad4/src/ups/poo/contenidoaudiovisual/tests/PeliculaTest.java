package ups.poo.contenidoaudiovisual.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ups.poo.contenidoaudiovisual.modelo.Pelicula;

class PeliculaTest {

	@Test
	void testMostrarDetallesPelicula() {
	    Pelicula pelicula = new Pelicula("Titanic", 195, "Romance", "Paramount");
	    String detalles = pelicula.mostrarDetalles();

	    assertTrue(detalles.contains("Titanic"));
	    assertTrue(detalles.contains("Romance"));
	    assertTrue(detalles.contains("Paramount"));
	}


}
