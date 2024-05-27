package replica_exception_contrasena;

public class WeakPasswordException extends Exception {
    public WeakPasswordException (String message) {
        super(message);
    }
}

class ShortPasswordException extends WeakPasswordException {
    public ShortPasswordException() {
        super("La contrasena es demasiado corta. Minimo 8 caracteres");
    }
}

class NotContainsNumber extends WeakPasswordException {
    public NotContainsNumber() {
        super("La contrasena debe tener minimo un numero");
    }
}

class NotContainsUppercase extends WeakPasswordException {
    public NotContainsUppercase () {
        super("La contrasena debe tener al menos una mayuscula");
    }
}
