package pe.com.peliculas.domain;

public class Pelicula {
    private int idNombre;
    private String nombre;
    public static int countId = 0;

    public Pelicula() {
        this.idNombre = ++Pelicula.countId;
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public int getIdNombre() {
        return this.idNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "idNombre=" + idNombre +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
