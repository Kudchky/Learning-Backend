package pe.com.peliculas.presentacion;

import pe.com.peliculas.negocio.*;

import java.util.Scanner;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int opcion = -1;
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("""
                    Seleccione una opcion:\s
                    1. Iniciar Catalogo de Peliculas.\s
                    2. Agregar una Pelicula. \s
                    3. Listar Peliculas. \s
                    4. Buscar Pelicula. \s
                    0. Salir.
                    """);
            System.out.print("> ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> catalogo.iniciarCatalogoPeliculas();
                case 2 -> {
                    System.out.print("Ingrese una Pelicula: ");
                    String pelicula = sc.nextLine();
                    catalogo.agregarPelicula(pelicula);
                }
                case 3 -> catalogo.listarPeliculas();
                case 4 -> {
                    System.out.print("Ingrese la Pelicula a buscar: ");
                    String buscaPelicula = sc.nextLine();
                    catalogo.buscarPelicula(buscaPelicula);
                }
                case 0 -> System.out.println("Hasta luego.... vuelva pronto");
                default -> System.out.println("Opcion no valida... Ingrese valor correcto");
            }
        }
    }
}
