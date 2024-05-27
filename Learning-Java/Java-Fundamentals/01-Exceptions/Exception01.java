import java.util.Scanner;

public class Exception01 {
    public static final String WELCOME = "_______________Bienvenido a la Aplicacion______________";
    public static final String INPUT01 = "Ingresa primer numero: ";
    public static final String INPUT02 = "Ingresa segundo numero: ";
    public static final String ERROR_DIV_ZERO = "No se puede dividir por cero";

    public static int dividir(int num01, int num02) {
        if(num02 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return num01 / num02;
    }

    public static void iniciarApp(Scanner sc) {
        System.out.println(WELCOME);
        System.out.print(INPUT01);
        int num01 = sc.nextInt();
        System.out.print(INPUT02);
        int num02 = sc.nextInt();
        try {
            System.out.println("La division es : " + dividir(num01, num02));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
