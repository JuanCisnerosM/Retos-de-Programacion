// Este código genera la serie de Fibonacci de manera iterativa hasta un número MAX especificado.

public class IterativeFibonacciV1 {
    public static void IterFibV1(int MAX) {
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacci = 0;

        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");

        for (int i = 2; i < MAX; i++) {
            fibonacci = firstNumber + secondNumber;
            System.out.print(fibonacci + " ");
            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci series: ");
        int MAX = 10; // Cambia este valor para generar más o menos números de Fibonacci
        IterFibV1(MAX);
    }
}

// Para MAX = 10, imprime: Fibonacci series: 0 1 1 2 3 5 8 13 21 34
 
// Aqui pasan varios cosas que se pueden mejorar:
// Para MAX = 1, imprime: Fibonacci series: 0 1   (en este caso no debería imprimir el "1")
/**
1. El método IterFibV1 debería devolver un valor (la serie de Fibonacci) en lugar de imprimirlo directamente.
2. Deberíamos usar un tipo de dato más adecuado para manejar grandes números de Fibonacci, como BigInteger.
3. No hay manejo de errores para valores de entrada no válidos (por ejemplo, MAX < 0).
**/

/**
Si vas a incrementar MAX, podemos cambiar el tipo de dato a long para evitar overflow (los int sobrepasan rápido).
Siempre agregar el primer número (0) a la salida, agrega "0" (Osea un MAX = 1, imprime "0")
Añade validaciones: if (MAX <= 0) return; y caso MAX > 1. 
Para producción: concatena la salida con StringBuilder y imprime una vez, mejora el rendimiento.
**/

