package Strings;
public class Strings {
    
    public static void main(String[] args) {
        
        // * Cademas de texto

        String name = "John";
        var surname = new String("Cena");

        // * Operaciones

        // * Concatenacion
        System.out.println(name + " " + surname);

        // * Longitud de un String
        System.out.println(name.length());

        // * Obtener caracteres
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(name.length() - 1)); // Obtener el ultimo caracter sin tener que poner el numero de posiciones con el charAt.(), solo pasandole la longitud - 1.

        // * Subcadenas
        System.out.println(name.substring(2)); // Empieza en la posicion 2 "hn"
        System.out.println(name.substring(1,3)); // empieza en la posicion 1 y acaba en la 3, pero exuclye la posicion final, seria como un < 3,  osea "oh"
        
        // * Mayusculas y Minisculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name); // Como no actulizamos el valor de la variable al imprimirla vuelve a salir como fue declarada, en este caso "John".

        // * Comprobar si contiene algo (esta "operacion" es case sensitive)
        System.out.println("Hola Mundo".contains("Java")); // La cadena "Hola Mundo" contiene la cadena "Java"
        System.out.println("Hola Mundo".contains("Mundo")); // La cadena "Hola Mundo" contienre la cadena "Mundo"
        System.out.println("Hola Mundo".toUpperCase().contains("UNDO")); // La cadena "HOLA MUNDO" (se aplico el uppercase), contiene la cadena "UNDO" 

        // * Comparacion
        System.out.println(name.equals("John")); // Comparar si una cadena de texto es igual a otra, si name es igual que "John"
        System.out.println(name.equals("john"));
        System.out.println(name.equalsIgnoreCase("john")); // Ignorar si es mayusculas o minusculas

        // * == vs .equals
        /**
         * ! En Strings no se debe usar el (==) para comparar si es igual, para este caso se usa el .equals()
         * 
         * el == hace una comparacion del objecto en si, por lo que la variable "a" y "b" son iguales pero "a" y "c" no lo son
         * 
         * el .equals() compara el contenido sin importar la naturaleza el objeto.
         */
        var a = "John";
        var b = "John";
        var c = new String("John");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // * Trim
        /**
         * El trim.() sirve para en la gran mayoria de escenarios borrar espacios en blanco al principio y al final
         */
        System.out.println("   1Hola, con espacios al inicio y al final2   ".trim());

        // * Replace
        /**
         * El replace.() sirve para remplacer algo por asi decirlo por otra cosa en la cadena de texto 
         */
        System.out.println("   Hola,  remplaza  los Espacios por una cadena sin espacios   ".replace(" ", ""));
        System.out.println("   Hola,  remplaza  los Espacios por una cadena sin espacios   ".replace("Hola", "Wazaaaaaaaaaaaa"));
        
        // * Format (equivalencia a la interpolacion)
        int age = 24;
        System.out.println(String.format("Hola, %s. Tengo %d años", name, age)); // ! Cuidado con los tipos de datos, si no coincide va a dar error. 
    }
}
