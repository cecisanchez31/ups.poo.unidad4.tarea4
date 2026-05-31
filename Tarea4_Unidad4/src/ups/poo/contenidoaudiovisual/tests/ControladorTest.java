package ups.poo.contenidoaudiovisual.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ups.poo.contenidoaudiovisual.controlador.Controlador;
import ups.poo.contenidoaudiovisual.modelo.ContenidoAudiovisual;
import ups.poo.contenidoaudiovisual.modelo.Pelicula;
import ups.poo.contenidoaudiovisual.vista.Vista;


class ControladorTest {

    private Controlador controlador;
    private List<ContenidoAudiovisual> contenidos;
    private Vista vista;

    @BeforeEach
    void setUp() {
        contenidos = new ArrayList<>();
        vista = new Vista();
        controlador = new Controlador(vista, contenidos);
    }

    @Test
    void testAgregarPeliculaEnLista() {
        Pelicula pelicula = new Pelicula("Titanic", 195, "Romance", "Paramount");
        contenidos.add(pelicula);
        assertEquals(1, contenidos.size());
        assertTrue(contenidos.get(0) instanceof Pelicula);
    }
}
