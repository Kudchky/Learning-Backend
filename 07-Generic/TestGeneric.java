public class TestGeneric {
    public static void main(String[] args) {
        Generic<Integer> objeto = new Generic(15);

        Generic<String> objeto2 = new Generic("Hola Generico");

        imprimirGenerico(objeto);
        imprimirGenerico(objeto2);
    }

    public static void imprimirGenerico(Generic objeto) {
        objeto.obtenerTipo();
    }
}
