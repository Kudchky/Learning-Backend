import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementarMovie im = new ImplementarMovie();
        options(sc, im);
    }

    public static void menu() {
        System.out.println("1.- Inserte Pelicula");
        System.out.println("2.- Listar Peliculas");
        System.out.println("3.-Buscar Pelicula");
        System.out.println("0.- Exit");
    }

    public static void options(Scanner sc, ImplementarMovie im) {
        String option = "";
        while (!option.equals("0")) {
            menu();
            option = sc.nextLine();
            switch (option) {
                case "1":
                    System.out.print("Ingrese nombre de pelicula: ");
                    String name = sc.nextLine();
                    System.out.print("Ingrese ano de pelicula: ");
                    int ano = Integer.parseInt(sc.nextLine());
                    im.insertar(new Movie(name, ano));
                    break;
                case "2":
                    System.out.println("Lista de Peliculas");
                    System.out.println("__________________");
                    im.listar();
                    break;
                case "3":
                    System.out.println("Ingrese nombre de pelicula a encontrar");
                    String nameBuscar = sc.nextLine();
                    im.buscar(nameBuscar);
                    break;
                case "0":
                    System.out.println("Gracias por usar la aplicacion.....!");
                    break;
            }
        }
    }
}
