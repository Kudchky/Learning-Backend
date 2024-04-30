package pe.com.gm.ventas;

import java.util.ArrayList;

public class Orden {
    private int idOrden;
    private ArrayList<Producto> listaProductos;
    public static int contadorOrdenes;
    public static final int MAX_PRODUCTOS = 5;

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
            System.out.println("pe.com.gm.ventas.Producto se agrego correctamente");
        } else {
            System.out.println("No se puede agregar producto, 5 productos por pe.com.gm.ventas.Orden");
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
        System.out.println("pe.com.gm.ventas.Orden{" +
                "idOrden=" + idOrden +
                ", listaProductos=" + listaProductos +
                '}');
    }

}
