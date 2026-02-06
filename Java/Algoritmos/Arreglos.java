public class Arreglos {
    
    public static void main(String[] args) {

        /**
         * * 1.Dado un arreglo de números enteros, escriba un algoritmo que identifique el número más grande en el arreglo y la primera posición de este número dentro del arreglo.
         * * Ejemplo: Si se tiene el arreglo {3, 32, 43, 2, 43, 32} el resultado debe ser: 43 en posición 2.
         */
        int[] arreglo1Ejercicio1 = { 3, 32, 43, 2, 43, 32 };

        int numero1 = arreglo1Ejercicio1[0];
        int posicion1 = 0;

        for (int i = 1; i < arreglo1Ejercicio1.length; i++) {
            if (arreglo1Ejercicio1[i] > numero1) {
                numero1 = arreglo1Ejercicio1[i];
                posicion1 = i;
            }
        }

        System.out.println("El numero mas grande es: " + numero1 + " y su posicion es: " + posicion1);

        /**
         * * 2.Dadas 2 arreglos de números ordenados, escriba un algoritmo que los integre en un 3er arreglo también ordenado. 
         * * Ejemplo: Para {1, 2, 6, 8, 9} y {3, 5, 6, 9} el resultado es {1, 2, 3, 5, 6, 6, 8, 9, 9}
         */
        int[] arreglo1Ejercicio2 = { 1, 2, 6, 8, 9 };
        int[] arreglo2Ejercicio2 = { 3, 5, 6, 8 };
        int[] arreglo3Ejercicio2 = new int[arreglo1Ejercicio2.length + arreglo2Ejercicio2.length];

        int i = 0; // Apuntador para el arrelgo 1
        int j = 0; // Apuntador para el arreglo 2
        int k = 0; // Apuntador para el arreglo 3

        while (i < arreglo1Ejercicio2.length && j < arreglo2Ejercicio2.length) {
            if (arreglo1Ejercicio2[i] <= arreglo2Ejercicio2[j]) {
                arreglo3Ejercicio2[k] = arreglo1Ejercicio2[i];
                i += 1;
            } else {
                arreglo3Ejercicio2[k] = arreglo2Ejercicio2[j];
                j += 1;
            }
            k += 1;
        }

        /**
         * El ciclo principal finaliza cuando uno de los arreglos se queda sin elementos.
         * Para completar el arreglo resultante, se copian los valores restantes del
         * arreglo que aún no se haya agotado.
         */
        /**
         * ! BORRAR ESTE COMENTARIO
         * Para este ejemplo el arreglo 1 es mas grande 
         * {1, 2, 6, 8, 9}
         * {3, 5, 6, 9}
         * por lo que va a sobrar un numero el (9) por la condicion && del while
         * entonces debemos copiar el restante al nuevo arreglo para mantener la longitud del arreglo 3 que es la usma del arreglo 1 y 2
         * si no se copia el restante el arreglo 3 terminara con un 0 en las posiciones faltantes.
         * 
         * Para evitar esto se hace otra condicion para copiar los elementos restantes del arreglo 1 al 3 y del arreglo 2 al 3 (si el arreglo 2 es mas grande que el 1)
         * 
         */
        // * Como los arrglos son de diferente longitud, se copia el restante del arreglo 1, si aun quedan numeros
        while (i < arreglo1Ejercicio2.length) {
            arreglo3Ejercicio2[k] = arreglo1Ejercicio2[i];
            i += 1;
            k += 1;
        }

        // * Como los arrglos son de diferente longitud, se copia el restante del arreglo 2, si aun quedan numeros
        while (j < arreglo2Ejercicio2.length) {
            arreglo3Ejercicio2[k] = arreglo2Ejercicio2[j];
            j += 1;
            k += 1;
        }

        System.out.print("El tercer arreglo es: ");

        for (int numberEjericio2 : arreglo3Ejercicio2) {
            System.out.print(numberEjericio2 + " ");
        }

        /**
         * * 3.	Para 2 arreglos de números ordenados, escriba un algoritmo que identifique los números que aparecen en ambos arreglos. 
         * * Ejemplo: Para {1, 3, 3, 4, 5, 6, 8, 9, 9} y {2, 2, 3, 5, 7, 9, 9}  el resultado es: {3, 5, 9, 9}
         */
        int[] arreglo1Ejercicio3 = { 1, 3, 3, 4, 5, 6, 8, 9, 9 };
        int[] arreglo2Ejercicio3 = { 2, 2, 3, 5, 7, 9, 9 };
        int[] arreglo3Ejercicio3 = new int[arreglo1Ejercicio3.length + arreglo2Ejercicio3.length];
        
        int i3 = 0; // Apuntador para el arreglo 1
        int j3 = 0; // Apuntador para el arreglo 2
        int k3 = 0; // Apuntador para el arreglo 3
        
        while (i3 < arreglo1Ejercicio3.length && j3 < arreglo2Ejercicio3.length) {
            if (arreglo1Ejercicio3[i3] == arreglo2Ejercicio3[j3]) {
                arreglo3Ejercicio3[k3] = arreglo1Ejercicio3[i3];
                i3 += 1;
                j3 += 1;
                k3 += 1;
            } else if (arreglo1Ejercicio3[i3] < arreglo2Ejercicio3[j3]) {
                i3 += 1;
            } else {
                j3 += 1;
            }
        }

        // Nuevo arreglo final para evitar varios ceros = 3 5 9 9 0 0 0 0 0 0 0 0 0 0 0 0
        int[] arregloFinalEjercicio3 = new int[k3];
        for (int x3 = 0; x3 < k3; x3++) {
            arregloFinalEjercicio3[x3] = arreglo3Ejercicio3[x3];
        }
        
        System.out.print("\nEl tercer arreglo de intersesccion es: ");
        for (int numberEjercio3 : arregloFinalEjercicio3) {
            System.out.print(numberEjercio3 + " ");
        }

        /**
         * * 4.	Escriba un algoritmo que identifique si con 3 longitudes: a, b y c (siempre enteras) se puede construir un triángulo. 
         * * Tip: En un triángulo la suma de 2 lados siempre es mayor que el 3º. Las longitudes no pueden ser negativas.
         */
        int a = 3;
        int b = 4;
        int c = 3;
        if (a % 1 != 0 || b % 1 != 0 || c % 1 != 0 || a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Los numeros no son enteros o las longitudes no pueden ser negativas");
            return;
        }
        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("\nSi se puede formar un triangulo con las longitudes: %d, %d, %d", a, b, c);    
        } else {
            System.out.printf("\nNo se puede formar un triangulo con las longitudes: %d, %d, %d", a, b, c);
        }

        /**
         * 5.	Escriba un algoritmo que lea los números de un arreglo y determine cuáles son los 2 números más grandes del arreglo.
         * Ejemplo: Para {1, 5, 9, 2, 15, 9, 10, 12} el resultado sería: 15 y 12.
         */
        int[] arreglo1Ejercicio5 = { 1, 5, 9, 2, 15, 9, 10, 12 };
        int max1Ejercicio5 = 0;
        int max2Ejercicio5 = 0;

        if (arreglo1Ejercicio5[0] >= arreglo1Ejercicio5[1]) {
            max1Ejercicio5 = arreglo1Ejercicio5[0];
            max2Ejercicio5 = arreglo1Ejercicio5[1];            
        } else {
            max1Ejercicio5 = arreglo1Ejercicio5[1];
            max2Ejercicio5 = arreglo1Ejercicio5[0];
        }
        for (int i5 = 2; i5 < arreglo1Ejercicio5.length; i5++) {
            if (arreglo1Ejercicio5[i5] > max1Ejercicio5) {
                max2Ejercicio5 = max1Ejercicio5;
                max1Ejercicio5 = arreglo1Ejercicio5[i5];
            } else if (arreglo1Ejercicio5[i5] > max2Ejercicio5) {
                max2Ejercicio5 = arreglo1Ejercicio5[i5];
            }
        }
        System.out.printf("\nLos 2 numeros mas grandes en el arreglo son: %d, %d", max1Ejercicio5, max2Ejercicio5);

    }
}
