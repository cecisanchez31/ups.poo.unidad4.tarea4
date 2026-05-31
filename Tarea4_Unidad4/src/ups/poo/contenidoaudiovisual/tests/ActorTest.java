package ups.poo.contenidoaudiovisual.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ups.poo.contenidoaudiovisual.modelo.Actor;

class ActorTest {
	 @Test
	    void testToStringActor() {
	        Actor actor = new Actor("Leonardo DiCaprio", 49);
	        String detalles = actor.toString();

	        assertTrue(detalles.contains("Leonardo DiCaprio"));
	        assertTrue(detalles.contains("49"));
	    }

}
