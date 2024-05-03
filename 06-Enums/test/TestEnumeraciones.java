package test;

import enumeracion.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);

        imprimirDiaSemana(Dias.DOMINGO);
        imprimirColor(Color.BLUE);
        System.out.println(Color.RED.getHexCode());

        System.out.println("Continente no. 4: " + Continentes.EUROPA);
        System.out.println("Nro de paises en America: " + Continentes.AMERICA.getPaises());
    }

    public static void imprimirDiaSemana(Dias dia) {
       switch (dia) {
           case LUNES -> System.out.println("Dia 1");
           case MARTES -> System.out.println("Dia 2");
           case MIERCOLES -> System.out.println("Dia 3");
           case JUEVES -> System.out.println("Dia 4");
           case VIERNES -> System.out.println("Dia 5");
           case SABADO -> System.out.println("Dia 6");
           case DOMINGO -> System.out.println("Dia 7");
           default -> System.out.println("Dia incorrecto");
       }
    }

    public static void imprimirColor(Color color) {
        switch (color) {
            case RED -> System.out.println("Color rojo");
            case GREEN -> System.out.println("Color verde");
            case BLUE -> System.out.println("Color azul");
            default -> System.out.println("Color incorrecto");
        }
    }
}
