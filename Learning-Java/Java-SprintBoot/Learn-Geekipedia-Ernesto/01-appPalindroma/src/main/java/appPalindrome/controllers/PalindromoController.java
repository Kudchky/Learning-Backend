package appPalindrome.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Controlador para verificar palindromos
 */

@RestController
public class PalindromoController {

    /**
     * Endpoint para verificar si una palabra es un palindromo.
     * @param word La palabra a verificar.
     * @return Un mensaje si la palabra es un palindromo o no.
     */
    @GetMapping("/validar-palindromo/{word}")
    public String validarPalindromo(@PathVariable String word) {
        return isPalindrome(word) ? "La palabra " + word + " SI es Palindromo" :
                "La palabra " + word + " NO es Palindromo";
    }

    /**
     * Metodo para verificar si una palabra es un palindromo.
     * @param word La palabra a verificar.
     * @return true si la palabra es  palindromo, false de lo contario.
     */
    private boolean isPalindrome(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length() / 2; i++) {
            char letter1 = word.charAt(i);
            char letter2 = word.charAt(word.length() - i - 1);
            if (letter1 != letter2) {
                return false;
            }
        }
        return true;
    }
}
