package ups.poo.contenidoaudiovisual.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ups.poo.contenidoaudiovisual.modelo.VideosFacebook;

class VideosFacebookTest {

	@Test
	void testMostrarDetallesFacebook() {
	    VideosFacebook video = new VideosFacebook("Receta", 10, "Cocina", "Chef Juan",1000);
	    String detalles = video.mostrarDetalles();

	    assertTrue(detalles.contains("Receta"));
	    assertTrue(detalles.contains("Cocina"));
	    assertTrue(detalles.contains("Chef Juan"));
	}


}
