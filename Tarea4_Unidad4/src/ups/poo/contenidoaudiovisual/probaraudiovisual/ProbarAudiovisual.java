package ups.poo.contenidoaudiovisual.probaraudiovisual;
import java.util.*;

import ups.poo.contenidoaudiovisual.controlador.Controlador;
import ups.poo.contenidoaudiovisual.modelo.ContenidoAudiovisual;
import ups.poo.contenidoaudiovisual.vista.Vista;


// Clase principal que arranca el sistema
// Principio Clean Code: punto de entrada claro y simple
public class ProbarAudiovisual {
    public static void main(String[] args) {
        // Crear la vista (interfaz en consola)
        Vista vista = new Vista();

        // Crear la lista de contenidos audiovisuales (abstracción)
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();

        // Crear el controlador, inyectando la vista y la lista
        Controlador controlador = new Controlador(vista, contenidos);

        // Iniciar el sistema (ciclo de menú)
        controlador.iniciar();
    }
}
