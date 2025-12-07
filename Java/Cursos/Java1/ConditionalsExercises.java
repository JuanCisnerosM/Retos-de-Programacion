public class ConditionalsExercises {
    
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        String name = "Jhon";
        int age = 18;

        if (age >= 18) {
            System.out.println(String.format("El ciudadano %s, ya tiene edad para votar", name));            
        } else {
            System.out.println(String.format("El ciudadano %s, NO tiene edad para votar", name));
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int a = 2;
        int b = 2;

        if (a > b) {
            System.out.println(String.format("El numero (%d) es mayor que el numero (%d)", a, b));            
        } else if (a < b) {
            System.out.println(String.format("El numero (%d) es menor que el numero (%d)", a, b));            
        } else {
            System.out.println(String.format("El numero (%d) es igual que (%d)", a, b));
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int c = 0;

        if (c < 0) {
            System.out.println(String.format("El numero (%d) es negativo", c));            
        } else if (c > 0) {
            System.out.println(String.format("El numero (%d) es positivo", c));
        } else {
            System.out.println(String.format("El numero (%d) es cero", c));
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int d = 8;
        if ((d % 2) == 0) {
            System.out.println(String.format("El numero (%d) es par", d));            
        } else {
            System.out.println(String.format("El numero (%d) es impar", d));            
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int e = 0;

        if ( e >= 1 && e <= 100) {
            System.out.println(String.format("El numero (%d) esta dentro del rango", e));
        } else {
            System.out.println(String.format("El numero (%d) sale del rango", e));            
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int f = 8;
        
        switch (f) {
            case 1:
                System.out.println("Lunes");                                
                break;
            case 2:
                System.out.println("Martes");     
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");                                
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un dia de la semana");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 90;

        if (nota >= 90) {
            System.out.println("La nota es sobresaliente");            
        } else if (nota >= 60 && nota < 90) {
            System.out.println("Aprobado");            
        } else {
            System.out.println("Reprobado");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad = 14;
        boolean acompañado = true;

        if (edad >= 15) {
            System.out.println("Puedes pasar al cine porque tienes mas de 15 años");
        } else if (edad < 15 && acompañado) {
            System.out.println("Puedes pasar por que vienes acompañado");            
        } else {
            System.out.println("No puedes pasar porque eres menor de 15 y no vienes acompañado");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String letra = "s";

        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" ||letra == "u" ) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra es una constante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int x = 111;
        int y = 34;
        int z = 33;

        if (x == y && y == z) {
            System.out.println("todos son iguales");            
        } else if (x > y && x > z) {
            System.out.println(String.format("El numero mas grande es x: %d", x));            
        } else if (y > x && y > z) {
            System.out.println(String.format("El numero mas grande es y: %d", y));            
        } else if (z > y && z > x) {
            System.out.println(String.format("El numero mas grande es z: %d", z));            
        } else {
            System.out.println("Hay dos numeros iguales que son el mas grande");
        }
    }
}
