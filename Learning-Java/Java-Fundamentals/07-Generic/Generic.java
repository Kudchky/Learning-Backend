public class Generic<T>{
    private T objeto;

    public Generic(T objecto) {
        this.objeto = objecto;
    }
    public void obtenerTipo() {
        System.out.println("El tipo T es = " + objeto.getClass().getSimpleName());
    }
}
