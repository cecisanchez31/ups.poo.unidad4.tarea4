package ups.poo.contenidoaudiovisual.modelo;

import java.util.ArrayList;
import java.util.List;

//Clase Serie de TV
public class SerieDeTV extends ContenidoAudiovisual {
 private List<Temporada> temporadas; // temporadas de la serie

 public SerieDeTV(String titulo, int duracion, String genero) {
     super(titulo, duracion, genero);
     this.temporadas = new ArrayList<>();
 }

 public void agregarTemporada(Temporada t) {
     temporadas.add(t);
 }

 @Override
 public String mostrarDetalles() {
     return "Serie: " + titulo + " (" + duracion + " min, Género: " + genero + ")";
 }
}