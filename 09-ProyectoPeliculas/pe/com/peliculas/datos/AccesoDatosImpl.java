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
    public List<Pelicula> listar(String nombre) {
        return List.of();
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        if (this.existe(nombreRecurso)) {
            File archivo = new File(nombreRecurso);
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
        if (this.existe(nombreRecurso)) {
            var archivo = new File(nombreRecurso);
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
    public void crear(String nombreRecurso) throws EscrituraDatosEx {
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
    public void borrar(String nombreRecurso) throws EscrituraDatosEx {
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
