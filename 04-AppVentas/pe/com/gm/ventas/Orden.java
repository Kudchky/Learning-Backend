package pe.com.gm.ventas;

import java.util.ArrayList;

public class Orden {
    private final int idOrden;
    private final ArrayList<Producto> listaProductos;
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 5;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.listaProductos = new ArrayList<>();
    }

    public int getIdOrden() {
        return idOrden;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarProducto(Producto producto) {
        if (this.listaProductos.size() < MAX_PRODUCTOS) {
            listaProductos.add(producto);
            System.out.println("Producto se agrego correctamente");
        } else {
            System.out.println("No se puede agregar producto, 5 productos por Orden");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto el : this.listaProductos) {
            total += el.getPrecio();
        }

        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden: {" +
                "idOrden=" + idOrden +
                ", listaProductos=" + listaProductos +
                "Precio: " +
                this.calcularTotal() +
                "}");
    }

}
