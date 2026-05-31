package ups.poo.contenidoaudiovisual.modelo;

//Clase Documental
public class Documental extends ContenidoAudiovisual {
 private String tema;                 // tema del documental
 private Investigador investigador;   // investigador principal

 public Documental(String titulo, int duracion, String genero, String tema, Investigador investigador) {
     super(titulo, duracion, genero);
     this.tema = tema;
     this.investigador = investigador;
 }

 @Override
 public String mostrarDetalles() {
     return "Documental: " + titulo + " (" + duracion + " min, Género: " + genero + "), Tema: " + tema +
            ", Investigador: " + investigador;
 }
}