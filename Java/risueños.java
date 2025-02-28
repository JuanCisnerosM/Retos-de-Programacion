/**
*TODO: En Java Escriba un programa que enumere los primeros diez números risueños ("soleados") desde el 200000000000, cuyos últimos dos dígitos sean un número primo. Un número N se dice que es risueño ("Sunny") si N+1 es un cuadrado perfecto. Del tipo de dato necesario, usar los métodos add, sart, multiply, equals, constructor, mod, int Value
*/

import java.math.BigInteger; // Para usar la clase BigInteger

public class risueños {
    public static void main(String[] args) {
        BigInteger start = new BigInteger("200000000000"); // Inicio desde 200000000000
        int count = 0; // Contador de números encontrados
        int limit = 10; // Cantidad de números a encontrar

        while (count < limit) {
            BigInteger next = start.add(BigInteger.ONE); // N + 1
            BigInteger sqrt = sqrtBigInteger(next); // Raíz cuadrada de (N+1)

            // Verificar si sqrt * sqrt == (N+1) (es decir, si es un cuadrado perfecto)
            if (sqrt.multiply(sqrt).equals(next)) {
                // Obtener los últimos dos dígitos
                int lastTwoDigits = start.mod(BigInteger.valueOf(100)).intValue();
                if (isPrime(lastTwoDigits)) { // Verificar si los últimos dos dígitos son primos
                    System.out.println(start); // Imprimir el número encontrado
                    count++;
                }
            }
            start = start.add(BigInteger.ONE); // Incrementar N
        }
    }

    // Método para calcular la raíz cuadrada de un BigInteger usando el método de Newton-Raphson
    private static BigInteger sqrtBigInteger(BigInteger num) {
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
            return num; // Raíz de 0 y 1 es el mismo número
        }

        BigInteger x = num;
        BigInteger y = num.divide(BigInteger.TWO); // Estimación inicial

        while (y.compareTo(x) < 0) {
            x = y;
            y = num.divide(x).add(x).divide(BigInteger.TWO);
        }

        return x; // Retorna la raíz cuadrada entera de num
    }

    // Método para verificar si un número de dos dígitos es primo
    private static boolean isPrime(int num) {
        if (num < 2) return false; // No hay primos menores que 2
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // Si es divisible por algún número, no es primo
        }
        return true; // Es primo
    }
}
