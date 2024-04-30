import java.util.Scanner;

public class Exception02 {
    public static void convertirEntero(Scanner sc) {
        System.out.print("Enter number to convert: ");
        String numberString = sc.nextLine();

        try {
            System.out.println("El resultado es: " + Integer.parseInt(numberString));
        } catch (Exception e) {
            System.out.println("Ingrese un numero entero por favor...!");
        } finally {
            sc.close();
        }

    }
}
