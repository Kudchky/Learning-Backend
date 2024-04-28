public class Customer extends Person{
    public Customer(String nombre, String apellido, String email, String telefono) {
       super(nombre, apellido, email, telefono);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
