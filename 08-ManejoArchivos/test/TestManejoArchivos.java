package test;

import static manejarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var rutaArchivo = "pruba02.txt";
        //crearArchivo(nombreArchivo);
        escribirArchivo(rutaArchivo, "Hola desde aca en Java");
        //Aca se esta sobrescribiendo en el archivo, queremos que hay continuidad
        escribirArchivo(rutaArchivo,"Hola doc");
    }
}
