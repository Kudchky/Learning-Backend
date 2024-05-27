public class Employee extends Person{
    private double salario;

    public Employee (String nombre, String apellido, String email, String telefono, double salario) {
        super(nombre, apellido, email, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", salario= '" + salario +
                '}';
    }
}
