package pe.com.gm.ventas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public Producto() {
        this.idProducto = ++contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: {" + "\n" +
                "idProducto=" + idProducto + "\n" +
                ", nombre='" + nombre + '\'' + "\n" +
                ", precio=" + precio +
                '}' + "\n";
    }
}
