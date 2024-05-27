package com.gm.mundopc;

import java.util.ArrayList;

public class Orden {
    private final int idOrden;
    private final ArrayList<Computadora> listaComputadoras;
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.listaComputadoras = new ArrayList<>();
    }

    public int getIdOrden() {
        return idOrden;
    }

    public ArrayList<Computadora> getListaComputadoras() {
        return listaComputadoras;
    }

    public void agregarComputadora(Computadora computadora) {
        if(this.listaComputadoras.size() < Orden.MAX_COMPUTADORAS) {
            this.listaComputadoras.add(computadora);
        } else {
            System.out.println("No se puede agregar mas computadoras, maximo " + MAX_COMPUTADORAS + " " +
                    "computadoras.");
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden{" +
                "idOrden=" + idOrden +
                ", listaComputadoras=" + listaComputadoras +
                '}');
    }
}
