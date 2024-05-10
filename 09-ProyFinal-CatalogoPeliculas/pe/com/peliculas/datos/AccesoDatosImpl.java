package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;

import java.util.List;

public class AccesoDatosImpl implements IAccesoDatos{
    @Override
    public boolean exite(String nombreArchivo) {
        return false;
    }

    @Override
    public List<Pelicula> listar(String nombre) {
        return List.of();
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        return "";
    }

    @Override
    public void crear(String nombreArchivo) {

    }

    @Override
    public void borrar(String nombreArchivo) {

    }
}
