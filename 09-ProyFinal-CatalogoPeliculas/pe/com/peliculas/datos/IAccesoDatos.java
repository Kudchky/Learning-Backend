package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;
import pe.com.peliculas.excepciones.*;

import java.util.List;

public interface IAccesoDatos {

    boolean exite(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
