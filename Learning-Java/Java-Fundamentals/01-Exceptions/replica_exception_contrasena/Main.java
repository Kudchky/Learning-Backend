package replica_exception_contrasena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su contrasena: ");
        String contrasena = sc.nextLine();

        try {
            ValidatorPassword.validator(contrasena);
            System.out.println("Contrasena fuerte... buen trabajo");
        } catch(WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
