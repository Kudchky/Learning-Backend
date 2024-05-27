package pe.com.gm.ventas.test;

import pe.com.gm.ventas.Orden;
import pe.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto01 = new Producto("Leche", 4.50);
        Producto producto02 = new Producto("Carne Molida", 22.4);
        Producto producto03 = new Producto("Mantequilla", 13.5);
        Producto producto04 = new Producto("Yogur Natural", 9.99);
        Producto producto05 = new Producto("Espinaca", 3.5);
        Producto producto06 = new Producto("Galletas", 0.50);

        Orden orden01 = new Orden();
        Orden orden02 = new Orden();

        //Agregando Productos a la orden
        orden01.agregarProducto(producto01);
        orden01.agregarProducto(producto02);
        orden01.agregarProducto(producto03);
        orden01.agregarProducto(producto04);
        orden01.agregarProducto(producto05);
        orden01.agregarProducto(producto06);

        orden02.agregarProducto(producto01);
        orden02.agregarProducto(producto02);
        orden02.agregarProducto(producto03);
        orden02.agregarProducto(producto04);
        orden02.agregarProducto(producto05);

        // Mostrando productos de la orden
        orden01.mostrarOrden();
        orden02.mostrarOrden();

    }
}
