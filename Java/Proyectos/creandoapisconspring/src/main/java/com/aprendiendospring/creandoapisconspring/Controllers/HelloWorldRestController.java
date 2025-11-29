package com.aprendiendospring.creandoapisconspring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    // @GetMapping("/hello")
    // public String helloWorld() {
    //     return "Hello, World!";
    // }

    @GetMapping({"/hola", "/saludo", "/saludo2", "/wazaaa"})   // --- Ejemplo de múltiples rutas, uso de llaves
    public String helloWorld() {
        return "Hello, World!";
    }
}
