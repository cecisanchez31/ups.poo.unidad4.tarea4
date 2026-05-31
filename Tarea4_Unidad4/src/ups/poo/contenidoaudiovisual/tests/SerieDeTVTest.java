package ups.poo.contenidoaudiovisual.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ups.poo.contenidoaudiovisual.modelo.SerieDeTV;

class SerieDeTVTest {

	@Test
	void testMostrarDetallesSerie() {
	    SerieDeTV serie = new SerieDeTV("Breaking Bad", 50, "Drama");
	    String detalles = serie.mostrarDetalles();

	    assertTrue(detalles.contains("Breaking Bad"));
	    assertTrue(detalles.contains("Drama"));
	    assertTrue(detalles.contains("5"));
	}

}
