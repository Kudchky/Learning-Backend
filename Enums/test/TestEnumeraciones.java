package test;

import enumeracion.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);

        imprimirDiaSemana(Dias.DOMINGO);
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
}
