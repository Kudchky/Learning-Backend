/*
Validación de Contraseñas: Escribe un método que verifique la fortaleza de una contraseña ingresada por
el usuario. Lanza una excepción personalizada si la contraseña es demasiado corta (menos de 8 caracteres),
no contiene números, o no tiene letras mayúsculas. Captura y maneja estas excepciones específicamente cuando
llames al método.
*/
import java.util.Scanner;

public class Exception05 {
    public static void validarContrasenas(Scanner sc) {
        System.out.println("Ingrese su contrasena: ");
        String contrasena = sc.nextLine();
        try {
            if (contrasena.length() < 8) {
                throw new Exception("Ingrese una contrasena de 8 caracteres como minimo.");
            }
            if(isContainsNumbers(contrasena)) {
                throw new Exception("Ingrese una contrasena que tenga por lo menos un numero");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean isContainsNumbers(String contrasena) {
        char[] caracteres = contrasena.toCharArray();
        for (char el: caracteres) {
            int number = el - '0';
            if(number >= 0 && number <= 9) {
               return true;
            }
        }
        return false;
    }
}
