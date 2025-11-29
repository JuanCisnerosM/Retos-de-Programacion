// Se agrega un nuevo método en el controlador que utiliza la anotación @PathVariable para
// recibir valores dinámicos desde la URL. Este ajuste permite mapear variables de ruta y
// procesarlas dentro del endpoint, facilitando operaciones basadas en identificadores o
// parámetros específicos enviados por el cliente.


package com.aprendiendospring.creandoapisconspring.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class GreetingRestController {

    // @GetMapping("/saludo/{name}")
    // public String greeting(@PathVariable String name) {
    //     return "Hola " + name + ", bienvenido a mi API creada con Spring Boot!";
    // }

    @GetMapping({"/saludo/{name}", "/hola/{name}"})  // --- Ejemplo de múltiples rutas con PathVariable

    public String greeting(@PathVariable String name) {
        return "Hola " + name + ", bienvenido a mi API creada con Spring Boot!";
    }

}
