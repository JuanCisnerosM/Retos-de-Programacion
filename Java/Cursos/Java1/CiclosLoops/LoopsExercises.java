package CiclosLoops;
import java.util.ArrayList;
import java.util.Arrays; // ! ArrayList<TipoDeVariable> nombreDeVariable = new ArrayList<>(Arrays.asList("dato1", "dato2", "datoX"));
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int x = 1;

        while (x < 11) {
            System.out.println(x);
            x++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> mArrayList = new ArrayList<>(Arrays.asList("Dato1", "Dato2", "Dato3", "Dato4"));
        int myArrayListCounter = 0;

        do {
            System.out.println(mArrayList.get(myArrayListCounter));
            myArrayListCounter++;
        } while (myArrayListCounter < mArrayList.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int i = 0; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] miArrary = { 3, 5, 7, 4, 9 };
        int sumaTotal = 0;

        for (int miArrayForEach : miArrary) {
            System.out.println(miArrayForEach);
        }

        for (int miArraySumaTotal : miArrary) {
            sumaTotal += miArraySumaTotal;
        }
        System.out.println("Suma total: " + sumaTotal);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] miStringArray = { "Hola", "Este", "Es", "Mi", "Array", "Tipo", "String" };

        for (int i = 0; i < miStringArray.length; i++) {
            System.out.println(miStringArray[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> miHashSet = new HashSet<>(Arrays.asList("Este", "Es", "Mi", "HashSet"));
        HashMap<Integer, String> miHashMap = new HashMap<>(Map.of(1, "a", 2, "Hola", 3, "Mi", 4, "HahsMap"));

        for (String forMiHashSeString : miHashSet) {
            System.out.println(forMiHashSeString);
        }

        for (Map.Entry<Integer, String> forMiHashMapString : miHashMap.entrySet()) {
            System.out.println(forMiHashMapString);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int y = 10; y >= 1; y--) {
            System.out.println(y);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int b[] = { 1, 2, 3, 4, 5, 6, 7, -4, 8, 9, 4, 3, 12 };

        for (Integer mIntegerArray : b) {
            if (mIntegerArray < 0) {
                break;
            }
            System.out.println(mIntegerArray);
        }
        
        // 10. Crea un programa que calcule el factorial de un número dado.
        int numero = 5;
        int factorial = 1;
        
        for (int i = numero; i >= 1; i--) {
            factorial = factorial * i; // * Como se repite factorial y es una multiplicacion se puede sustituir por un "*" antes del signo igual quedando 'factorial *=i';
        }
        System.out.println(String.format("El factorial de %d es %d", numero, factorial));
    }
}