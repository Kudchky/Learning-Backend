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
    public void agregarPelicula(String nombrePelicula) {
        try {
            boolean anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(new Pelicula(nombrePelicula), NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            this.datos.listar(NOMBRE_RECURSO).forEach(pelicula -> System.out.println("La pelicula " + pelicula));
        } catch (AccesoDatosEx e) {
            System.out.println("Error al listar peliculas " + e.getMessage());
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String dato) {
        String resultado = "No se encontro Pelicula";
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, dato);
        } catch (AccesoDatosEx e) {
            System.out.println("Error al buscar pelicula" + e.getMessage());
        }

        System.out.println("El resultado es: " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            } else {
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error al iniciar catalogo de peliculas");
            e.printStackTrace(System.out);
        }
    }
}
