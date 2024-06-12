package appPalindrome.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PalindromoController {

    //this is an endpoint
    @GetMapping("/validar-palindromo/{word}")
    public String validarPalindromo(@PathVariable String word) {
        return isPalindrome(word) ? "La palabra " + word + " SI es Palindromo" :
                "La palabra " + word + " NO es Palindromo";
    }

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
