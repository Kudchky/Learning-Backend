package appPalindrome.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class palindromoController {
    @GetMapping("/hello")
    public String helloWord() {
        return "Hola pinche pendejo";
    }
}
