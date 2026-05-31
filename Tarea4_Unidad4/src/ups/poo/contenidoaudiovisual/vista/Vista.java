package ups.poo.contenidoaudiovisual.vista;

import java.util.*;

//Vista: interacción con el usuario en consola
public class Vista {
 private Scanner scanner = new Scanner(System.in);

 public void mostrarMenu() {
     System.out.println("\n=== MENÚ PRINCIPAL ===");
     System.out.println("1. Crear Película");
     System.out.println("2. Crear Serie de TV");
     System.out.println("3. Crear Documental");
     System.out.println("4. Crear Video Facebook");
     System.out.println("5. Crear Video TikTok");
     System.out.println("6. Mostrar todos los contenidos");
     System.out.println("7. Guardar contenidos en archivo CSV");
     System.out.println("8. Leer contenidos desde archivo CSV");
     System.out.println("0. Salir");
     System.out.print("Elige una opción: ");
 }

 public int leerOpcion() {
     return scanner.nextInt();
 }

 public Scanner getScanner() {
     return scanner;
 }
}
