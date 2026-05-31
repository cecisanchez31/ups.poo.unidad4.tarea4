package ups.poo.contenidoaudiovisual.controlador;

import java.util.*;

import ups.poo.contenidoaudiovisual.modelo.*;
import ups.poo.contenidoaudiovisual.persistencia.ManejoArchivos;
import ups.poo.contenidoaudiovisual.vista.Vista;
   

// Clase Controlador: coordina la lógica del sistema
// Principio DIP: depende de abstracciones (List<ContenidoAudiovisual>) en lugar de implementaciones concretas
public class Controlador {
    private Vista vista;                          
    private List<ContenidoAudiovisual> contenidos; 

    // Constructor: recibe la vista y la lista de contenidos
    public Controlador(Vista vista, List<ContenidoAudiovisual> contenidos) {
        this.vista = vista;
        this.contenidos = contenidos;
    }

    // Método principal: ciclo de ejecución del menú
    public void iniciar() {
        int opcion;
        do {
            vista.mostrarMenu();       // Mostrar menú en consola
            opcion = vista.leerOpcion(); // Leer opción elegida por el usuario
            procesarOpcion(opcion);     // Procesar la opción
        } while (opcion != 0);          // Repetir hasta que el usuario elija salir
    }

    // Procesa cada opción del menú
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> crearPelicula();       
            case 2 -> crearSerie();          
            case 3 -> crearDocumental();     
            case 4 -> crearVideoFacebook();  
            case 5 -> crearVideoTiktok();    
            case 6 -> mostrarContenidos();   
            case 7 -> guardarEnArchivo();    
            case 8 -> leerDesdeArchivo();    
            case 0 -> System.out.println(" Saliendo del sistema...");
            default -> System.out.println(" Opción inválida.");
        }
    }

    // Crear una película con datos ingresados por el usuario
    private void crearPelicula() {
        Scanner sc = vista.getScanner();
        sc.nextLine(); 
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print(" Duración (minutos): ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Estudio: ");
        String estudio = sc.nextLine();

        Pelicula pelicula = new Pelicula(titulo, duracion, genero, estudio); 
        contenidos.add(pelicula); 
        System.out.println("✅ Película creada: " + pelicula.mostrarDetalles());
    }

    // Crear una serie con datos ingresados por el usuario
    private void crearSerie() {
        Scanner sc = vista.getScanner();
        sc.nextLine();
        System.out.print("Título de la serie: ");
        String titulo = sc.nextLine();
        System.out.print("Duración promedio por episodio: ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print(" Género: ");
        String genero = sc.nextLine();

        SerieDeTV serie = new SerieDeTV(titulo, duracion, genero); 
        contenidos.add(serie);
        System.out.println("✅ Serie creada: " + serie.mostrarDetalles());
    }

    // Crear un documental con datos ingresados por el usuario
    private void crearDocumental() {
        Scanner sc = vista.getScanner();
        sc.nextLine();
        System.out.print("Título del documental: ");
        String titulo = sc.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Tema: ");
        String tema = sc.nextLine();
        System.out.print("Nombre del investigador: ");
        String nombreInv = sc.nextLine();
        System.out.print("Edad del investigador: ");
        int edadInv = sc.nextInt(); sc.nextLine();

        Investigador inv = new Investigador(nombreInv, edadInv); 
        Documental doc = new Documental(titulo, duracion, genero, tema, inv); 
        contenidos.add(doc);
        System.out.println("Documental creado: " + doc.mostrarDetalles());
    }

    // Crear un video de Facebook con datos ingresados por el usuario
    private void crearVideoFacebook() {
        Scanner sc = vista.getScanner();
        sc.nextLine();
        System.out.print("Título del video: ");
        String titulo = sc.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Canal: ");
        String canal = sc.nextLine();
        System.out.print("Visualizaciones: ");
        int visualizaciones = sc.nextInt(); sc.nextLine();

        VideosFacebook video = new VideosFacebook(titulo, duracion, genero, canal, visualizaciones);
        contenidos.add(video);
        System.out.println("Video de Facebook creado: " + video.mostrarDetalles());
    }

    // Crear un video de TikTok con datos ingresados por el usuario
    private void crearVideoTiktok() {
        Scanner sc = vista.getScanner();
        sc.nextLine();
        System.out.print("Título del video: ");
        String titulo = sc.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Creador: ");
        String creador = sc.nextLine();
        System.out.print("Likes: ");
        int likes = sc.nextInt(); sc.nextLine();
        System.out.print("Comentarios: ");
        int comentarios = sc.nextInt(); sc.nextLine();

        VideosTiktok video = new VideosTiktok(titulo, duracion, genero, creador, likes, comentarios);
        contenidos.add(video);
        System.out.println("Video de TikTok creado: " + video.mostrarDetalles());
    }

    // Mostrar todos los contenidos creados
    private void mostrarContenidos() {
        System.out.println("\nLista de contenidos:");
        contenidos.forEach(c -> System.out.println(c.mostrarDetalles()));
    }

    // Guardar contenidos en archivo CSV
    private void guardarEnArchivo() {
        ManejoArchivos.guardarCSV("contenidos.csv", contenidos);
    }

    // Leer contenidos desde archivo CSV
    private void leerDesdeArchivo() {
        List<String> datos = ManejoArchivos.leerCSV("contenidos.csv");
        System.out.println("\nContenidos leídos desde archivo:");
        datos.forEach(System.out::println);
    }
}

