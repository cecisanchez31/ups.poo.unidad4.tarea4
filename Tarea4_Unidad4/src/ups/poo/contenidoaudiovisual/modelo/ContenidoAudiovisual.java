package ups.poo.contenidoaudiovisual.modelo;

//Clase abstracta base para todos los contenidos audiovisuales
//Principios: SRP (una sola responsabilidad), OCP (abierta a extensión), LSP (subclases sustituibles)
public abstract class ContenidoAudiovisual {
 protected String titulo;   // título del contenido
 protected int duracion;    // duración en minutos
 protected String genero;   // género del contenido

 // Constructor para inicializar atributos comunes
 public ContenidoAudiovisual(String titulo, int duracion, String genero) {
     this.titulo = titulo;
     this.duracion = duracion;
     this.genero = genero;
 }
 

 // Método abstracto que cada subclase debe implementar
 public abstract String mostrarDetalles();

 // Representación en texto del objeto
 @Override
 public String toString() {
     return mostrarDetalles();
 }
}
