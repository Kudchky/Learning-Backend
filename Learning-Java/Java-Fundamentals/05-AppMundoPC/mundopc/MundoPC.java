package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Raton raton01 = new Raton("USB", "HP");
        Raton raton02 = new Raton("Bluetooth", "DELL");

        Teclado teclado01 = new Teclado("Bluetooth", "MSI");
        Teclado teclado02 = new Teclado("USB", "ACER");

        Monitor monitor01 = new Monitor("HP", 15);
        Monitor monitor02 = new Monitor("DELL", 27);

        Computadora computadora01 = new Computadora("HP", monitor01, teclado01, raton01);
        Computadora computadora02 = new Computadora("Ensamblada", monitor02, teclado02, raton02);

        Orden orden01 = new Orden();
        Orden orden02 = new Orden();

        orden01.agregarComputadora(computadora01);
        orden01.agregarComputadora(computadora02);

        orden02.agregarComputadora(computadora01);
        orden02.agregarComputadora(computadora02);

        orden01.mostrarOrden();
        System.out.println();
        orden02.mostrarOrden();



    }
}
