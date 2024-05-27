import java.util.Scanner;

/*
Manejo de Múltiples Excepciones: Modifica el ejercicio de conversión de cadenas a números para que
también maneje situaciones donde se pueden producir diferentes tipos de excepciones, como NullPointerException
si el usuario no ingresa nada y simplemente presiona enter.
*/
public class Exception04 {
    public static void convertirAString(Scanner sc) {
        System.out.println("Ingrese un numero");
        String input = sc.nextLine();
        try {
            if (input == null || input.isEmpty()) {
                throw new NullPointerException("Error: Entrada vacia.");
            }
            int number = Integer.parseInt(input.trim());
            System.out.println("El numero es: " + number);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no valida ingrese numeros.");
        } finally {
            sc.close();
        }
    }
}
