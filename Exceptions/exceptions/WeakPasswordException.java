package exceptions;

public class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class ShortPasswordException extends WeakPasswordException {
    public ShortPasswordException() {
        super("La contrasena es demasiado corta. Debe tener al menos 8 caracteres.");

    }
}

class NoDigitPasswordException extends WeakPasswordException {
    public NoDigitPasswordException() {
        super("La contrasena debe contener al menos un digito.");
    }
}

class NoUpperCasePasswordException extends WeakPasswordException {
    public NoUpperCasePasswordException() {
        super("La contrasena debe contener al menos una letra mayuscula.");
    }
}
