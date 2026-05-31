package ups.poo.contenidoaudiovisual.modelo;

//Clase Investigador
public class Investigador {
 private String nombre;
 private int edad;

 public Investigador(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 @Override
 public String toString() {
     return nombre + " (" + edad + " años)";
 }
}