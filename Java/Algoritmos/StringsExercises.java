public class StringsExercises {
    
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.
        String name1 = "Visca";
        String name2 = "Barca";
        
        System.out.println(name1 + " " + name2);

        // 2. Muestra la longitud de una cadena de texto.
        String superWord1 = "Instituto";

        System.out.println(superWord1.length());

        // 3. Muestra el primer y último carácter de un string.
        String word3 = "Bankai";

        System.out.println(word3.charAt(0));
        System.out.println(word3.charAt(word3.length() - 1));
        

        // 4. Convierte a mayúsculas y minúsculas un string.
        String word4 = "Zanka No Tachi";
        System.out.println(word4.toUpperCase());
        System.out.println(word4.toLowerCase());
        
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String word5 = "Instituto Politecnico Nacional";
        System.out.println(word5.contains("Politecnico"));

        // 6. Formatea un string con un entero.
        int a = 45;

        System.out.println(String.format("Messi tiene %d trofeos", a));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String word6 = "  Hola como estas ?  ";
        System.out.println(word6.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(word6.replace(" ", "-"));


        // 9. Comprueba si dos strings son iguales.
        String word7 = "Bankai";
        String word8 = "BANKAI";
        String word9 = "Bankai";

        System.out.println(word7.equals(word8));
        System.out.println(word7.equals(word9));
        System.out.println(word7.equalsIgnoreCase(word8));

        // 10. Comprueba si dos strings tienen la misma longitud.
        String word10 = "Algebra";
        String word11 = "Sony";
        String word12 = "Iphone2";

        System.out.println(word10.length() == (word11.length()));
        System.out.println(word10.length() == (word12.length()));
    }
}
