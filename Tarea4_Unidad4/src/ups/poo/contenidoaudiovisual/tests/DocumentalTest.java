package ups.poo.contenidoaudiovisual.tests;
import ups.poo.contenidoaudiovisual.modelo.ContenidoAudiovisual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ups.poo.contenidoaudiovisual.modelo.Documental;
import ups.poo.contenidoaudiovisual.modelo.Investigador;

class DocumentalTest {

	  @Test
	    void testMostrarDetallesDocumental() {
	        Investigador inv = new Investigador("David Attenborough", 32);
	        Documental doc = new Documental("Planeta Tierra", 90, "Naturaleza", "BBC", inv);

	        String detalles = doc.mostrarDetalles();

	        assertTrue(detalles.contains("Planeta Tierra"));
	        assertTrue(detalles.contains("Naturaleza"));
	        assertTrue(detalles.contains("BBC"));
	        assertTrue(detalles.contains("David Attenborough"));
	    }
}
