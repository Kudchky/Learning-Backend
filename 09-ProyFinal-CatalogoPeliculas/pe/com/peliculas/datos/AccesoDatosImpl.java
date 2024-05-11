package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;
import pe.com.peliculas.excepciones.*;

import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {


    @Override
    public boolean exite(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        List<Pelicula> listPeliculas = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea = lector.readLine();
            while (linea != null) {
                listPeliculas.add(new Pelicula(linea));
                linea = lector.readLine();
            }
            lector.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + e.getMessage());
        }

        return listPeliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreRecurso);
        try {
            PrintWriter escribir = new PrintWriter(new FileWriter(archivo, anexar));
            escribir.println(pelicula.toString());
            escribir.close();
            System.out.println("Se agrego pelicula en el archivo");
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir archivo: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        return "";
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {

    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
        } else {
            System.out.println("No se encontro el archivo a borrar");
        }
    }
}
