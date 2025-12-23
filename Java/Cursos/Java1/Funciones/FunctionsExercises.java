package Funciones;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void miFuncion1() {
        System.out.println("Bienvenido al Curso Java desde Cero");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void miFucnion2(String name) {
        System.out.println("Hola " + name);        
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static void miFuncion3(int a, int b) {
        System.out.println(String.format("La resta de (%d) y (%d) es: " + (a - b), a, b));
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static void miFuncion4(int a) {
        System.out.println(String.format("El cuadrado de (%d) es: " + (a * a), a));
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static void miFuncion5(int a) {
        if (a % 2 == 0) {
            System.out.println(String.format("El numero %d es par", a));
        } else {
            System.out.println(String.format("El numero %d, es impar", a));
        }
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean miFuncion6(int a) {
        if (a < 18) {
            System.out.println(String.format("Es (%d) mayor de edad? ", a));
            return false;
        }
        System.out.println(String.format("Es (%d) mayor de edad? ", a));
        return true;
    }
    
    public static boolean miFuncion6v2(int a) {
        if (a < 18) {
            return false;
        }
        return true; 
    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static void miFuncion7(String cadena) {
        System.out.println("La longitud de la cadena es: " + cadena.length());
    }

    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static double miFuncion8(int[] numbers) {
        double a = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        }
        
        return a / numbers.length;
    }

    // 9. Escribe un método que reciba un número y retorna su factorial.
    public static int miFuncion9(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("El factorial para un numero negativo no esta definido"); // Revisar uso de esta Exepcion
        }

        int factorial = 1;
        
        for (int i = a; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static void miFuncion10(ArrayList<String> miArrayList) {
        for (String miCadenaArray : miArrayList) {
            System.out.println(miCadenaArray);
        }
    }

    
    public static void main(String[] args) {
        
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        miFuncion1();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        miFucnion2("JoJo");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        miFuncion3(5,3);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        miFuncion4(9);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        miFuncion5(19);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        System.out.println(miFuncion6(15)); // Imprimir el estado directamente, pero este metodo tiene un print dentro por lo que muetra la pregunta y luego abajo el estado

        // Otra forma de evaluar (pero este metodo no tiene ningun println dentro), es "sacando el estado" y luego imprimir SOLO el estado
        var stateMiFuncion6v2 = miFuncion6v2(18);
        System.out.println(stateMiFuncion6v2); 

        // Como en esta funcion no hay ningun print dentro solo nos devuelde el estado, similar a la linea 77 (sin la pregunta, ya que no hay print dentro del metodo)
        System.out.println(miFuncion6v2(12));
        
        // Entonces si queremos ser explicitos debemos de pooner la pregunta en el print 
        System.out.println("Es mayor de edad? " + miFuncion6v2(12)); 

        // ! No podemos llamar solo asi la funcion por que no nos retorna el estado o no retorna nada ni dice nada
        miFuncion6v2(25);

        // ! Aqui si nos muestra algo por consola pero lo muestra porque dentro del bloque del metedo hay un println: 
        // ! System.out.println(String.format("Es (%d) mayor de edad? ", a));
        // ! Pero no devuelve el estado, que en este problema es lo que necesitamos, el estado true o false, 
        // ! por lo que si o si debemos de hacerlo dentro del println como en la linea 77.
        miFuncion6(25);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        miFuncion7("AllargatBasto");

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        int[] miFuncion8Numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(miFuncion8(miFuncion8Numbers));

        // 9. Escribe un método que reciba un número y retorna su factorial.
        System.out.println("El factorial de (5!) es: " + miFuncion9(5));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> mArrayList = new ArrayList<>(Arrays.asList("Hola", "este", "es", "mi", "ArrayList()"));
        miFuncion10(mArrayList);
    }
}
