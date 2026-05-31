package ups.poo.contenidoaudiovisual.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ups.poo.contenidoaudiovisual.modelo.Temporada;

class TemporadaTest {

	@Test
    void testToStringTemporada() {
        Temporada t = new Temporada(1, 10);
        String salida = t.toString();

        assertTrue(salida.contains("Temporada 1"));
        assertTrue(salida.contains("10 episodios"));
    }

    @Test
    void testToStringOtraTemporada() {
        Temporada t = new Temporada(2, 8);
        String salida = t.toString();

        assertTrue(salida.contains("Temporada 2"));
        assertTrue(salida.contains("8 episodios"));
    }

}
