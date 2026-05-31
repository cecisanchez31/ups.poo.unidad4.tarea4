package ups.poo.contenidoaudiovisual.modelo;
import ups.poo.contenidoaudiovisual.interfaces.Reproducible;


//Clase VideosTiktok
public class VideosTiktok extends ContenidoAudiovisual implements Reproducible {
 private String creador;
 private int likes;
 private int comentarios;

 public VideosTiktok(String titulo, int duracion, String genero, String creador, int likes, int comentarios) {
     super(titulo, duracion, genero);
     this.creador = creador;
     this.likes = likes;
     this.comentarios = comentarios;
 }

 @Override
 public String mostrarDetalles() {
     return "Video TikTok: " + titulo + " (" + duracion + " min, Género: " + genero +
            "), Creador: " + creador + ", Likes: " + likes + ", Comentarios: " + comentarios;
 }

 @Override
 public void reproducir() {
     System.out.println("▶ Reproduciendo video de TikTok...");
 }
}