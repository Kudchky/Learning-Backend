package manejarchivos;

import java.io.*;

public class ManejoArchivos {
    //Este metodo crea un archivo en el disco duro
    public static void crearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);// archivo representa un archivo en el sitema de archivos
        /* Ahora guardar archivo en disco */
        try {
            //aca se abre el archivo, aun no se guarda
            PrintWriter salida = new PrintWriter(archivo);//se abre flujo de escritura con PrintWriter
            //aca se guarda el archivo en disco, cerrando el flujo que se abrio con salida
            salida.close();
            //luego de que estamo seguros de que el flujo se a cerrado
            System.out.println("Se ha creado el archivo en disco");
        } catch (FileNotFoundException e) {
            //reportar la expecion a la consola estandar con system.out
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String rutaArchivo,  String contenido) {
        File archivo = new File(rutaArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

}
