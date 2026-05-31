package ups.poo.contenidoaudiovisual.modelo;

import java.util.*;

//Clase Película
public class Pelicula extends ContenidoAudiovisual {
 private String estudio;              // estudio de producción
 private List<Actor> actores;         // lista de actores

 public Pelicula(String titulo, int duracion, String genero, String estudio) {
     super(titulo, duracion, genero);
     this.estudio = estudio;
     this.actores = new ArrayList<>();
 }

 public void agregarActor(Actor a) {
     actores.add(a);
 }

 @Override
 public String mostrarDetalles() {
     return "Película: " + titulo + " (" + duracion + " min, Género: " + genero + "), Estudio: " + estudio;
 }
}