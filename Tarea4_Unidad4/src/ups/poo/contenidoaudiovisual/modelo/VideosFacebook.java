package ups.poo.contenidoaudiovisual.modelo;
import ups.poo.contenidoaudiovisual.interfaces.Descargable;
import ups.poo.contenidoaudiovisual.interfaces.Reproducible;

//Clase VideosFacebook
public class VideosFacebook extends ContenidoAudiovisual implements Reproducible, Descargable {
 private String canal;
 private int visualizaciones;

 public VideosFacebook(String titulo, int duracion, String genero, String canal, int visualizaciones) {
     super(titulo, duracion, genero);
     this.canal = canal;
     this.visualizaciones = visualizaciones;
 }

 @Override
 public String mostrarDetalles() {
     return "Video Facebook: " + titulo + " (" + duracion + " min, Género: " + genero +
            "), Canal: " + canal + ", Visualizaciones: " + visualizaciones;
 }

 @Override
 public void reproducir() {
     System.out.println("▶ Reproduciendo video de Facebook...");
 }

 @Override
 public void descargar() {
     System.out.println("⬇ Descargando video de Facebook...");
 }
}