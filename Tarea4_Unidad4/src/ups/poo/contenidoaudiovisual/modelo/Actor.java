package ups.poo.contenidoaudiovisual.modelo;

//Clase Actor
public class Actor {
 private String nombre;
 private int edad;

 public Actor(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 @Override
 public String toString() {
     return nombre + " (" + edad + " años)";
 }
}