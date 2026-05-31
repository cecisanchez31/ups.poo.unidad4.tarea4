package ups.poo.contenidoaudiovisual.persistencia;

import java.io.*;
import java.util.*;
import ups.poo.contenidoaudiovisual.modelo.ContenidoAudiovisual;

// Clase utilitaria para manejo de archivos CSV
// Principio SRP: solo maneja lectura/escritura de archivos
public class ManejoArchivos {

    // Guardar lista de contenidos en archivo CSV
    public static void guardarCSV(String archivo, List<ContenidoAudiovisual> contenidos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            for (ContenidoAudiovisual c : contenidos) {
                pw.println(c.toString());
            }
            System.out.println(" Datos guardados en " + archivo);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    // Leer archivo CSV y devolver lista de líneas
    public static List<String> leerCSV(String archivo) {
        List<String> lineas = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(archivo))) {
            while (sc.hasNextLine()) {
                lineas.add(sc.nextLine());
            }
            System.out.println("Datos leídos desde " + archivo);
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
        return lineas;
    }
}
