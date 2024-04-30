package com.gm.mundopc;

public abstract class DispositivoEntrada {
   protected String tipoEntrada;
   protected String marca;

   protected DispositivoEntrada(String tipoEntrada, String marca) {
       this.tipoEntrada = tipoEntrada;
       this.marca = marca;
   }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
