package DataTypesConstantsVariables;

public class VariablesAndConstants {
    
    public static void main(String[] args) {

        // * Variables

        /**
         * * ¿Que es una variable?
         * Una variable en Java es un espacio en la memoria para almacenar datos que pueden cambiar durante la ejecución de un programa
         */
        String name = "John"; // Tipo de dato cadena (String)
        System.out.println(name);

        name = "Pedro";
        System.out.println(name); // Se uso la misma variable "name", pero al ser variable se puede cambiar su valor, en este caso se cambio "John" por "Pedro"
        
        /**
         * * La salida esperada seria:
         *    John
         *    Pedro
         */
        int age = 24; // Tipo de dato entero (int)
        System.out.println(age);

        /**
         * * La salida hasta ahora es:
         *    John
         *    Pedro
         *    24
         */

        /**
         * * Palabra reservada "var"
         * Se usa para declarar variables en varios lenguajes de programación, aunque su comportamiento puede variar,
         * se utiliza para la inferencia de tipos, permitiendo al compilador determinar el tipo de dato automáticamente según el valor asignado
         */
        var email = "micorreo2@gmail.com"; // Variable de tipo String
        System.out.println(email);
        
        var year = 2025;
        System.out.println(year); // Variable de tipo int


        // * Constantes

        /**
         * * ¿Que es una Constante?
         * Una constante en Java es una variable cuyo valor no se puede modificar después de que se le asigna un valor inicial.
         * Uso de la palabra reservada "final"
         * Buena practica de las constantes es ponerla en mayusculas
         */
        final String EMAIL = "micorreo@correo.com";
        System.out.println(EMAIL);
    }
}
