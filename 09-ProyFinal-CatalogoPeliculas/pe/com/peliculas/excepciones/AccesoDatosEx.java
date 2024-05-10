package pe.com.peliculas.excepciones;

public class AccesoDatosEx extends Exception {
    public AccesoDatosEx(String message) {
        super(message);
    }
}

class EscrituraDatosEx extends AccesoDatosEx {
    public EscrituraDatosEx(String message) {
        super(message);
    }
}

class LecturaDatosEx extends AccesoDatosEx {
    public LecturaDatosEx(String message) {
        super(message);
    }
}