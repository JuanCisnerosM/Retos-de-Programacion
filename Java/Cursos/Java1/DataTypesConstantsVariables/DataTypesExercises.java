package DataTypesConstantsVariables;
public class DataTypesExercises {
    
    public static void main(String[] args) {
        
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name1 = "John";
        System.out.println(name1);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 24;
        System.out.println(edad);

        // 3. Crea una variable double con tu altura en metros.
        double hight = 1.79;
        System.out.println(hight);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean myBoolean = true;
        if (myBoolean) {
            System.out.println("Me gusta promramar");
        } else {
            System.out.println("No me gusta");
        }
        
        // 5. Declara una constante con tu email.
        final String email = "micorreo@email.com";
        System.out.println(email);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myFirstLetter = 'J';
        System.out.println(myFirstLetter);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String locaclidad = "Tatoine";
        System.out.println(locaclidad);
        
        locaclidad = "Courusant";
        System.out.println(locaclidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2;
        int b = 4;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        /**
         * ! Para imprimir el tipo de una variable en Java,
         * ! utiliza el método getClass().getSimpleName() combinado con System.out.println(). 
         * ! Si la variable es de un tipo primitivo, necesitas hacer un casting a Object primero para poder llamar al método getClass()
         */
        System.out.println(((Object) a).getClass().getSimpleName());
        System.out.println(((Object) b).getClass().getSimpleName());
        
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int c;
        c = 3;

        System.out.println(c);

    }
}
