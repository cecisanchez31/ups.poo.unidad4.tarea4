package ups.poo.contenidoaudiovisual.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ups.poo.contenidoaudiovisual.modelo.VideosTiktok;

class VideosTiktokTest {

	@Test
	void testMostrarDetallesTiktok() {
	    VideosTiktok video = new VideosTiktok("Baile", 2, "Entretenimiento", "Usuario123", 2500,146);
	    String detalles = video.mostrarDetalles();

	    assertTrue(detalles.contains("Baile"));
	    assertTrue(detalles.contains("Entretenimiento"));
	    assertTrue(detalles.contains("Usuario123"));
	}


}
