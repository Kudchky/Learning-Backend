package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;

import java.io.*;
import java.util.List;

public class AccesoDatosImpl implements IAccesoDatos {

    public AccesoDatosImpl() {
    }

    @Override
    public boolean exite(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) {
        return List.of();
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha ingresado informacion correctamente al archivo.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        return "";
    }

    @Override
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se a creado el archivo en disco");
        } catch(FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void borrar(String nombreArchivo) {

    }
}
