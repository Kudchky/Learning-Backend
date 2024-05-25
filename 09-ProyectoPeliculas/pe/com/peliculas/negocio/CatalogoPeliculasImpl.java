package pe.com.peliculas.negocio;

import pe.com.peliculas.datos.*;
import pe.com.peliculas.domain.Pelicula;
import pe.com.peliculas.exceptions.*;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        try {
            datos.escribir(new Pelicula(nombrePelicula), nombreArchivo, true);
        } catch (EscrituraDatosEx e) {
            System.out.println("Error al agregar pelicula " + e.getMessage());
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            datos.listar(nombreArchivo).forEach(pelicula -> System.out.println("La pelicula " + pelicula));
        } catch (LecturaDatosEx e) {
            System.out.println("Error al listar peliculas " + e.getMessage());
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String dato) {
        try {
            System.out.println(datos.buscar(nombreArchivo, dato));
        } catch (LecturaDatosEx e) {
            System.out.println("Error al buscar pelicula" + e.getMessage());
        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            datos.crear(nombreArchivo);
        } catch (AccesoDatosEx e) {
            System.out.println("Error al iniciar archivo " + e.getMessage());
        }
    }
}
