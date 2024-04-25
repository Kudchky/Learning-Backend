package exceptions;

public class PasswordValidator {
    public static void validatePassword(String password) throws WeakPasswordException{
        if(password.length() < 8) {
            throw new ShortPasswordException();
        }
        if(!password.matches(".*\\d.*")) {
            throw new NoDigitPasswordException();
        }
        if(!password.matches(".*[A-Z].*")) {
            throw new NoUpperCasePasswordException();
        }
    }
}
