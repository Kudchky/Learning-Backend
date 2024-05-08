package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "/home/meliodas/Downloads/pruba02.txt";
        crearArchivo(nombreArchivo);
    }
}
