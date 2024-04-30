import java.util.ArrayList;

public class AppEmpleadoCliente {
    public static ArrayList<Person> listaPersonas = new ArrayList<>();

    public static void main(String[] args) {
        Person empleado1 = new Employee("Juan", "Perez", "juan@perez.com", "985623122", 4500.45);
        agregarPersona(empleado1);
        Person cliente1 = new Customer("Pol", "Castillo", "pol@castillo.com", "987845123");
        agregarPersona(cliente1);
    }

    public static void agregarPersona(Person person) {
            listaPersonas.add(person);
            System.out.println(person);
    }
}
