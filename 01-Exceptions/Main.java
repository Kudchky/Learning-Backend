import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Exception01.iniciarApp(sc);
        //Exception02.convertirEntero(sc);
       /* try {
            Exception03.printPositionArray(sc);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println("Ingresa un valor entero");
        } finally {
            sc.close();
            System.out.println("Terminado");
        */
//        Exception04.convertirAString(sc);
//        System.out.println("Terminado");
        Exception05.validarContrasenas(sc);
    }
}
