
	package ups.poo.contenidoaudiovisual.tests;

	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.Test;
	import ups.poo.contenidoaudiovisual.modelo.ContenidoAudiovisual;

	class ContenidoAudiovisualTest {

	    // Subclase temporal para probar la clase abstracta
	    static class ContenidoAudiovisualPrueba extends ContenidoAudiovisual {
	        public ContenidoAudiovisualPrueba(String titulo, int duracion, String genero) {
	            super(titulo, duracion, genero);
	        }

	        @Override
	        public String mostrarDetalles() {
	            // Usamos directamente los atributos que inicializa el constructor
	            return "Dummy: " + titulo + " - " + genero + " (" + duracion + " min)";
	        }
	    }

	    @Test
	    void testMostrarDetalles() {
	        ContenidoAudiovisualPrueba contenido = new ContenidoAudiovisualPrueba("Prueba", 120, "Acción");
	        String detalles = contenido.mostrarDetalles();

	        assertTrue(detalles.contains("Prueba"));
	        assertTrue(detalles.contains("Acción"));
	        assertTrue(detalles.contains("120"));
	    }
	}

