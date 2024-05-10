package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;
import pe.com.peliculas.excepciones.*;
import java.util.List;

public interface IAccesoDatos {

    boolean exite(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);

    String buscar(String nombreArchivo, String buscar);

    void crear(String nombreArchivo);

    void borrar(String nombreArchivo);
}
