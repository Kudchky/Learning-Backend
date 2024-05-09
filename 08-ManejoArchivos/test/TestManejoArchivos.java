package test;

import static manejarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var rutaArchivo = "prueba01.txt";
        //crearArchivo(nombreArchivo);
        anexarArchivo(rutaArchivo, "Hola desde aca en Java");
        //Aca se está sobrescribiendo en el archivo, queremos que hay continuidad
        anexarArchivo(rutaArchivo,"Hola doc");
    }
}
