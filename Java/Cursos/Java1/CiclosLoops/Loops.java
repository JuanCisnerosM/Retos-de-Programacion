package CiclosLoops;
import java.util.HashSet;
import java.util.Map;
import java.util.Arrays; // ! importante para crear Estructuras con datos de la forma ArrayList<TipoDeVariable> nombreDeVariable = new ArrayList<>(Arrays.asList("dato1", "dato2", "datoX"));
import java.util.HashMap;

public class Loops {
    
    public static void main(String[] args) {

        // * Loops (Bucles, Ciclos)
        /**
         * Un ciclo en Java (o bucle) es una estructura de control que permite repetir un bloque de código varias veces 
         * mientras se cumpla una condición específica, optimizando tareas repetitivas como procesar listas o contar, 
         * en lugar de escribir el mismo código una y otra vez, y los tipos principales son for, while, do-while y forEach. 
         */

        // * for
        /**
         * for: Ideal para cuando sabes cuántas veces necesitas repetir el ciclo (por contador).
         * Componentes: Inicialización, condición y actualización del contador, todo en una misma línea.
         * 
         * Uso de la palabra reservada for () {}
         * 
         *  Su sintaxis básica es for (inicialización; condición; actualización) { // código a ejecutar }
         * 
         * Ejemplo: for (int i = 0; i < 10; i++) { ... }.
         * 
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola Java, 5 veses");
            /**
             * * Esto seria algo como "Para "i" desde 0 hasta menor que 5, ejecuta el bloque" 
             * * El bloque va a imprimir "Hola Java, 5 veces" y el contador a va a aumentar de 0 a 1 y vuelve a decir 1 es menor que 5 si, imprime otra vez el bolque
             * 
             * cuando llegamos a i = 5, entonces 5 es menor que 5 no, entonces ya no se ejecuta el bloque porque no cumple la condicion
             */
        }

        String[] array = { "uno", "dos", "tres", "cuatro", "cinco", "diez" };
        System.out.println(array.length); // * La longitud es iguala a 6 , pero se empieza a contar desde 0, (0, 1, 2, 3, 4, 5)
        for (int i = 0; i < array.length; i++) { // Esto desia como: para i = 0; i < 6; i++
            System.out.println(array[i]); // imprime el array [posicion de "i"]
            // Imprime array[0]
            // Imprime array[1]
            // Imprime array[2]
            // Imprime array[3]
            // Imprime array[4]
            // Imprime array[5]
            /**
             * * En este caso seria como "Para "i" desde 0 hasta menor que la longitud de "array", ejecuta el bloque"
             * * Y el bloque seria, "Imprime el arreglo "array" en el indice "i" (con el i++, el la variable i aumenta uno en cada iteracion hasta llegar a la condicion osea la lingutd de "array")"
             * 
             * Índices:   0      1        2        3        4        5
             * Valores:  uno    dos     tres    cuatro    cinco     diez
             */
        }

        String[] array2 = { "uno", "dos", "tres", "cuatro", "cinco", "diez" };
        for (int i = 0; i < array2.length; i++) { // Esto es como: para i = 0; i < 6; i++
            System.out.println(array2[(array2.length - 1) - i]); // imprime el array [posicion de "i"]
            // Imprime array2[(6 - 1) - 0]  = array2[5]
            // Imprime array2[(6 - 1) - 1]  = array2[4]
            // Imprime array2[(6 - 1) - 2]  = array2[3]
            // Imprime array2[(6 - 1) - 4]  = array2[2]
            // Imprime array2[(6 - 1) - 5]  = array2[1]
            /**
             * * En este caso seria como "Para "i" desde 0 hasta menor que la longitud de "array", ejecuta el bloque"
             * * Y el bloque seria, Para i desde 0 hasta length-1, imprime el elemento en posición (length - 1 - i), invirtiendo el orden
             * 
             * Índices:   0      1        2        3        4        5
             * Valores:  uno    dos     tres    cuatro    cinco     diez
             */
        }

        // * for-each
        /**
         * El ciclo for-each sirve para recorrer fácilmente todos los elementos de una colección (como arrays o listas) de forma secuencial, 
         * ejecutando un bloque de código para cada uno, sin necesidad de manejar índices, haciendo el código más limpio, legible y seguro al evitar errores comunes de índice, 
         * ideal para tareas simples como procesar todos los datos de un listado. 
         * 
         * Cuándo NO usarlo:
         * Necesitas el índice: Si necesitas el índice del elemento (por ejemplo, para acceder a otro array a la vez).
         * Recorrer al revés o saltando elementos: No permite control granular sobre el índice para hacer saltos o ir en orden inverso; para eso, usa un for tradicional o while. 
         * 
         * Ejemplo: Recorrer un array de números
         * int[] numeros = {10, 20, 30, 40};
         * for (int numero : numeros) {
         *     System.out.println(numero); // Imprime 10, luego 20, 30, 40
         * }
         * 
         * Ejemplo: Recorrer una lista de String
         * List<String> nombres = Arrays.asList("Ana", "Luis", "Marta");
         * for (String nombre : nombres) {
         *     System.out.println("Hola, " + nombre); // Hola, Ana, Hola, Luis, Hola, Marta
         * }
         */

        String[] array3 = { "1uno", "2dos", "3tres", "4cuatro", "5cinco", "10diez" };

        // Debemos de crear una variable del mismo tipo que la estructura para almacenar los elemenros del array o de la lista o del set o de la estructura (XD nomas)

        for (String varArray3 : array3) { // Creamos una variable de tipo String llamada "varArray3" que contendra "array3" (osea el arreglo que creamos)
            System.out.println(varArray3);
        }

        // Ejemplo con un HashSet
        // Requiere import java.util.Arrays; 
        // ! importante para crear Estructuras con datos de la forma ArrayList<TipoDeVariable> nombreDeVariable = new ArrayList<>(Arrays.asList("dato1", "dato2", "datoX"));

        HashSet<String> hashset1 = new HashSet<>(Arrays.asList("hashset1", "hashset2"));
        HashSet<Integer> hashset2 = new HashSet<>(Arrays.asList(2, 3, 4, 6));
        HashMap<Integer, String> hashMap3 = new HashMap<>(Map.of(1, "dato1", 2, "dato2", 3, "dato3"));

        for (String varHashSet1 : hashset1) {
            System.out.println(varHashSet1);
        }

        for (Integer varHashSet2 : hashset2) {
            System.out.println(varHashSet2);
        }

        // Recorre todas las entradas del HashMap y muestra cada par clave-valor
        // el hashMap3 se contierte en un set con el ".entrySet()", por que no podemos recorrer un mapa como tal
        // entonces debebos de tener una variable del tipo entry (en este caso varHashMap3 es del tipo Map.Entry<TipoVariable1, TipoVariable2>), 
        // la cual debemos de transformar en un Set.
        for (Map.Entry<Integer, String> varHashMap3 : hashMap3.entrySet()) {
            System.out.println(varHashMap3);
            // System.out.println(varHashMap3.getValue()); // Solo obtener el Valor
            // System.out.println(varHashMap3.getKey()); // Solo obtener la llave
            /**
             * * Entonces lo que tenemos es un clave-valor que una vez accedemeos a la variable "entry", 
             * * ya podemos elegir que mostrar si la llave o el valoe 
             */
        }

        // * while
        /**
         * En algunos casos es mas optimo que el bucle for
         * 
         * pero si no se configura bien puede pasar el bucle infinito
         * 
         * int while1 = 0;
         * while (while1 < 5) {
         *     System.out.println("Hola desde el bucle while");
         * }
         * 
         * ! Aqui la variable while1 nunca cambia de valor que es 0, por lo que la condicion se cumple infinitas veces ( donde 0 es menor que 5),
         * ! por lo que el contador debe ir adentro del bloque 
         */
        int while1 = 0;
        while (while1 < 5) {
            System.out.println("Hola desde el bucle while");
            while1++; // Con esto evitamos que se veulva infinito
        }

        while1 = 0; // Volvemos a "resetear" a 0 la variable

        // Ahora vamos a usar otra vez el array 
        // String[] array3 = { "1uno", "2dos", "3tres", "4cuatro", "5cinco", "10diez" };  // longitud ( length = 6)
        /**
         * Índices:   0      1        2        3        4        5
         * Valores:  1uno   2dos    3tres   4cuatro   5cinco  10diez
         */
        while (while1 < array3.length) {
            System.out.println(array3[while1]);
            while1++;
        }
        
        // Poner criterios/condiciones en al while
        while1 = 0; // Volvemos a "resetear" a 0 la variable

        // Ahora vamos a usar otra vez el array 
        // String[] array3 = { "1uno", "2dos", "3tres", "4cuatro", "5cinco", "10diez" };  // longitud ( length = 6)
        /**
         * Índices:   0      1        2        3        4        5
         * Valores:  1uno   2dos    3tres   4cuatro   5cinco  10diez
         */
        while (while1 < array3.length) {
            System.out.println(array3[while1]);
            if (array3[while1].equals("2dos")) { // ! Condicion/Criterio, en el momento que el valor sea a igual a "2dos", entonces el contador aumenta en 2 en vez de en 1
                while1 += 2;
            }
            while1++; // Si se cumple la condicion entonces auemtaria en 2+1 y si no se cumple el if solo en 1
            /**
             * Por lo que la salida queda
             * 1uno
             * 2dos
             * 5cinco
             * 10diez
             */
        }

        // Otro Criterio
        
        while1 = 0; // Volvemos a "resetear" a 0 la variable
        boolean find = false;

        // Ahora vamos a usar otra vez el array 
        // String[] array3 = { "1uno", "2dos", "3tres", "4cuatro", "5cinco", "10diez" };  // longitud ( length = 6)
        /**
         * Índices:   0      1        2        3        4        5
         * Valores:  1uno   2dos    3tres   4cuatro   5cinco  10diez
         */
        while (!find) { // Mientras find sea falso, o mas bien mientras find no sea verdadero, porque !find es !false que esto siginifia true, ya que es la negacion de false es true (lo contrario de false, true) es como poner find == false
            System.out.println(array3[while1]);
            if (array3[while1].equals("3tres")) {
                find = true; // Como aqui find ya es true (se cumple la condicion de !find), el ciclo while termina
            }
            while1++;
        }

        // * do-while
        /**
         * El bucle do-while en Java sirve para ejecutar un bloque de código al menos una vez y luego repetirlo mientras una condición sea verdadera, 
         * evaluando la condición al final, a diferencia de un while que la evalúa al principio. 
         * Es ideal para situaciones donde necesitas que una acción ocurra al menos una vez, como pedir una entrada al usuario y validarla repetidamente hasta que sea correcta, 
         * o en juegos donde el turno de un jugador debe ejecutarse antes de verificar si el juego termina. 
         */
        while1 = 0; // Volvemos a "resetear" a 0 la variable

        do {
            System.out.println("Hola desde el do-while");
            while1++;            
        } while (while1 < 0);

        // * Control de bucles
        /**
         * Instrucicones para "sejar" de ejecutar o "continuar ejecutando" el codigo
         * 
         * * Palabras reservadas: "break" y "continue"
         * 
         */

        // * break
        // String[] array3 = { "1uno", "2dos", "3tres", "4cuatro", "5cinco", "10diez" };

        for (String varArray3 : array3) { // Creamos una variable de tipo String llamada "varArray3" que contendra "array3" (osea el arreglo que creamos)
            if (varArray3.equals("4cuatro")) {
                break; // * Si se cumple la condicion (if) entonces, termina el bloque (se sale del bucle), si no imprime el valor.
            }
            System.out.println(varArray3);
            /**
             * En este caso el ciclo for se ejecuta hasta:
             * 1uno
             * 2dos
             * 3tres
             */
        }
        
        // * continue
        // String[] array3 = { "1uno", "2dos", "3tres", "4cuatro", "5cinco", "10diez" };

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue; // * El continue "fuerza" la siguiente iteracion del ciclo for, digamos que lo "salta", por lo que cuando "i" vale 3, hace que vuelva a ejecutar el ciclo for, y no mandaria a imprimir el numero 3.               
            }
            System.out.println(i);
            /**
             * 0
             * 1
             * 2
             * 4
             */
        }
    }
}
