package exceptions_contrasenas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.print("Ingrese una contrasena: ");
            String contrasena = sc.nextLine();
            PasswordValidator.validatePassword(contrasena);
            System.out.println("La contrasena es fuerte");
        } catch (WeakPasswordException e) {
            System.out.println("Error de validacion " + e.getMessage());
        }
    }
}
