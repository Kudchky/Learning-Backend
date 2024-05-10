package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;

import java.util.List;

public interface IAccesoDatos {

    boolean exite(String nombreArchivo);

    List<Pelicula> listar(String nombre);

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);

    String buscar(String nombreArchivo, String buscar);

    void crear(String nombreArchivo);

    void borrar(String nombreArchivo);
}
