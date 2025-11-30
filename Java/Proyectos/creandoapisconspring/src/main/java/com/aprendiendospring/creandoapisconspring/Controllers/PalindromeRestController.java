package com.aprendiendospring.creandoapisconspring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para validar si una palabra es un palíndromo.
 */

@RestController
public class PalindromeRestController {

    /**
     * Endpoint para validar si una palabra es un palíndromo.
     * @param word La palabra a validar como palíndromo.
     * @return Un mensaje indicando si la palabra es un palíndromo o no.
     */

    @GetMapping("/validar-palindromo/{word}")
    public String Palindrome(@PathVariable String word) {
        if (isPalindrome(word)) {
            return "La palabra " + word + " es un palíndromo.";
        } else {
            return "La palabra " + word + " no es un palíndromo.";
        }
    }

    /**
     * Metodo para verificar si una palabra es un palíndromo.
     * @param word La palabra a verificar
     * @return true si la palabra es un palíndromo, false en caso contrario
     */
    // Logica para verificar si una palabra es un palíndromo, ignorando mayúsculas y minúsculas
    // La logica no debe estar en el método del controlador, sino en un método aparte
    private boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
