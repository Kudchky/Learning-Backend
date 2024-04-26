import java.util.ArrayList;

public class ImplementarMovie implements ICatalog{
    private ArrayList<Movie> movies;

    public ImplementarMovie() {
        this.movies = new ArrayList<>();
    }

    @Override
    public void insertar(Object o) {
        Movie movie = (Movie) o;
        this.movies.add(movie);
    }

    @Override
    public void listar() {
        for (Movie el: movies) {
            System.out.println(el);
        }
    }

    @Override
    public void buscar(String name) {
        for (Movie el: movies) {
            if(el.getName().equals(name)) {
                System.out.println(el);
                return;
            }
        }
        System.out.println("No se encontro la pelicula");
    }
}
