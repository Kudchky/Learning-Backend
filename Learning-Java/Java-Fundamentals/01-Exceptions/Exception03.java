import java.util.Scanner;

public class Exception03 {
    public static void printPositionArray(Scanner sc) {
        String[] names = {"Juan", "Pedro", "Pool", "Xiomara", "Xavier"};
        System.out.println("Enter position to printer in array: ");
        int position = sc.nextInt();
        if (position <= 1 || position > names.length) {
            throw new ArrayIndexOutOfBoundsException("Ingrese una posicion valida");
        } else {
            System.out.println("El nombre es: " + names[position - 1]);
        }
    }
}
