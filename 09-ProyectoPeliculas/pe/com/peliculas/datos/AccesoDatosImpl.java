package pe.com.peliculas.datos;

import pe.com.peliculas.domain.Pelicula;
import pe.com.peliculas.exceptions.*;

import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {
    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
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
                throw new LecturaDatosEx("Ocurrio un error en la lectura del archivo acontecio:");
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
                escribir.println(pelicula.getNombre());
                System.out.println("Se ha escrito correctamente pelicula al archivo");
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
                while (lectura != null) {
                    if (lectura.contains(dato)) {
                        return "Se encontro el dato: " + dato;
                    }
                    lectura = entrada.readLine();
                }
            } catch (IOException e) {
                throw new LecturaDatosEx("Error de lectura");
            }

            return "Dato no encontrado";
        } else {
            throw new LecturaDatosEx("El archivo no existe");
        }
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        if (!this.existe(nombreRecurso)) {
            File archivo = new File(nombreRecurso);
            try (PrintWriter escritor = new PrintWriter(archivo)) {
                System.out.println("Se creo archivo correctamente");
            } catch (IOException e) {
                throw new EscrituraDatosEx("Ocurrio un problema con la creacion del archivo");
            }
        } else {
            System.out.println("El archivo ya existe, esta creado");
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        if (this.existe(nombreRecurso)) {
            File archivo = new File(nombreRecurso);
            if (archivo.delete()) {
                System.out.println("Archivo elimininado");
            } else {
                throw new EscrituraDatosEx("No se pudo borrar el archivo");
            }
        } else {
            System.out.println("El archivo no existe");
        }
    }
}
