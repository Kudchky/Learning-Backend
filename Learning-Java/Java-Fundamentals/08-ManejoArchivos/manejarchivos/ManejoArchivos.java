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

    public static void anexarArchivo(String rutaArchivo, String contenido) {
        File archivo = new File(rutaArchivo);
        //La Clase FileWriter es para indicar que se va anexar info al archivo
        //donde true indica que se va hacer append de la informacion
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado información al archivo");
        } catch(IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        //La clase Bufferedreader lo que hace es leer lineas completas del archivo caracater a
        //caracter.
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

}
