package pe.com.peliculas.excepciones;

public class AccesoDatosEx extends Exception {
    public AccesoDatosEx(String message) {
        super(message);
    }
}

class EscrituraDatosEx extends AccesoDatosEx {
    public EscrituraDatosEx() {
        super("Error de Escritura en el archivo...!");
    }
}

class LecturaDatosEx extends AccesoDatosEx {
    public LecturaDatosEx() {
        super("Error de Lectura al acceder al archivo....!");
    }
}