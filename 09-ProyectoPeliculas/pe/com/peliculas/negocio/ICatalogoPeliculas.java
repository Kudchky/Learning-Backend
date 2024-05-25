package pe.com.peliculas.negocio;

public interface ICatalogoPeliculas {
    void agregarPelicula(String nombrePelicula, String nombreArchivo);

    void listarPeliculas(String nombreArchivo);

    void buscarPelicula(String nombreArchivo, String dato);

    void iniciarArchivo(String nombreArchivo);
}
