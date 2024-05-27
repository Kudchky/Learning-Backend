package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;
import pe.com.peliculas.exceptions.*;

import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {
    @Override
    public boolean existe(String nombreRecurso) {
        File archivo = new File(nombreRecurso);

        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        List<Pelicula> listaPeliculas = new ArrayList<>();

        if (archivo.exists()) {
            try (var lector = new BufferedReader(new FileReader(archivo))) {
                var linea = lector.readLine();
                while (linea != null) {
                    listaPeliculas.add(new Pelicula(linea));
                    linea = lector.readLine();
                }
            } catch (IOException e) {
                throw new LecturaDatosEx("Ocurrio un error en la lectura del archivo al listar " +
                        "peliculas:");
            }
        } else {
            throw new LecturaDatosEx("Archivo o recurso no existe");
        }
        return listaPeliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            try (PrintWriter escribir = new PrintWriter(new FileWriter(archivo, anexar))) {
                escribir.println(pelicula.toString());
                System.out.println("Se ha escrito correctamente pelicula al archivo" + pelicula);
            } catch (IOException e) {
                throw new EscrituraDatosEx("Ocurrio un problema con la escritura de datos");
            }
        } else {
            throw new EscrituraDatosEx("El archivo no existe " + nombreRecurso);
        }
    }

    @Override
    public String buscar(String nombreRecurso, String dato) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);

        if (archivo.exists()) {
            try (var entrada = new BufferedReader(new FileReader(archivo))) {
                String lectura = entrada.readLine();
                int indice = 1;
                while (lectura != null) {
                    if (dato != null && dato.equalsIgnoreCase(lectura)) {
                        return "Se encontro la Pelicula: " + dato + " en la linea nro. " + indice;
                    }
                    lectura = entrada.readLine();
                    indice++;
                }
            } catch (IOException e) {
                throw new LecturaDatosEx("Error de lectura al buscar pelicula");
            }

            return "Pelicula no encontrado";
        } else {
            throw new LecturaDatosEx("El archivo no existe");
        }
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        if (!archivo.exists()) {
            try (PrintWriter escritor = new PrintWriter(new FileWriter(archivo))) {
                System.out.println("Se creo archivo correctamente");
            } catch (IOException e) {
                throw new AccesoDatosEx("Ocurrio un problema con la creacion del archivo");
            }
        } else {
            System.out.println("El archivo ya existe, esta creado");
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("Archivo elimininado");
            } else {
                throw new AccesoDatosEx("No se pudo borrar el archivo");
            }
        } else {
            System.out.println("El archivo no existe");
        }
    }
}
