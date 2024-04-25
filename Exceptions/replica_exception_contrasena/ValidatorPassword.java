package replica_exception_contrasena;

public class ValidatorPassword {
    public static void validator(String contrasena) throws WeakPasswordException {
        if(contrasena.length() < 8) {
            throw new ShortPasswordException();
        }
        if(!contrasena.matches(".*\\d.*")) {
            throw new NotContainsNumber();
        }
        if(!contrasena.matches(".*[A-Z].*")) {
            throw new NotContainsUppercase();
        }
    }
}
