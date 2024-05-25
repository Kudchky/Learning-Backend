package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;
import pe.com.peliculas.exceptions.*;

import java.util.List;

public interface IAccesoDatos {
    boolean existe(String nombreRecurso);
    List<Pelicula> listar(String nombre);
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    String buscar(String nombreRecurso, String dato) throws LecturaDatosEx;
    void crear(String nombreRecurso) throws EscrituraDatosEx;
    void borrar(String nombreRecurso) throws EscrituraDatosEx;
}
