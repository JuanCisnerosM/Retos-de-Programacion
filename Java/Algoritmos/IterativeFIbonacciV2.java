// Ese código genera la serie de Fibonacci de manera iterativa y la imprime en una sola línea.
// Se han añadido validaciones para el valor de MAX y se ha mejorado la eficiencia de la salida usando StringBuilder.

public class IterativeFIbonacciV2 {
    public static void IterFibV2(int MAX) {
        // Validación de entrada, que MAX sea positivo
        if (MAX <= 0) {
            System.out.println("El valor de MAX debe ser mayor que 0.");
            return;
        }

        StringBuilder sb = new StringBuilder();

        // Inicializar los dos primeros números de la serie: 0 y 1
        long firstNumber = 0, secondNumber = 1;

        // Siempre agregar el primer número (0) a la salida
        sb.append(firstNumber); // <-- agrega "0"  (Osea MAX = 1, imprime "0")
        
        // Solo agregar el segundo número (1) si MAX > 1
        // Si MAX = 1 → imprime solo "0"
        if (MAX > 1) { // <-- si MAX > 1, agrega "1"
            sb.append(", ").append(secondNumber); // Solo se ejecuta si MAX > 1, ejemplo, Si MAX >= 2 → imprime "0 1"
        }

        // A partir del tercer número (i = 2), generar la serie hasta MAX        
        for (int i = 2; i < MAX; i++) { // si tenemos MAX = 1, no entra en el bucle
            long fibonacci = firstNumber + secondNumber; // Calcular el siguiente número como suma de los dos anteriores
            sb.append(", ").append(fibonacci); // Agregarlo a la salida
            firstNumber = secondNumber; // Actualizar las variables first y second para la siguiente iteración
            secondNumber = fibonacci; // Actualizar las variables first y second para la siguiente iteración
        }

        // Imprimir la serie completa en una sola línea
        System.out.println(sb.toString());
    }
    
    public static void main(String[] args) {
        System.out.print("Fibonacci series: ");
        int MAX = 10; // Cambia este valor para generar más o menos números de Fibonacci
        IterFibV2(MAX);
    }
}

// Para MAX = 10, imprime: Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
// Para MAX = 1, imprime: Fibonacci series: 0