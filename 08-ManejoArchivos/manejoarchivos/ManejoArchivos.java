package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        //Este metodo crea un archivo en el disco duro
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
}
