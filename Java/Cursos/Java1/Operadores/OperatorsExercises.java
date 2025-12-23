package Operadores;
public class OperatorsExercises {
    
    public static void main(String[] args) {
        
        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a1 = 0 + 1;
        int a2 = 5 - 3;
        int a3 = 3 * 1;
        int a4 = 8 / 2;
        int a5 = 15 % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        // 2. Crea una variable para cada tipo de operación de asignación.
        int b1 = 1;
        int b2 = 1;
        b2 += 1;
        int b3 = 4;
        b3 -= 1;
        int b4 = 2;
        b4 *= 2;
        int b5 = 10;
        b5 /= 2;
        int b6 = 16;
        b6 %= 10;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        int c1 = 18;
        int c2 = 11;
        int c3 = 22;
        int c4 = 3;

        System.out.println(c1 == (c4*6));
        System.out.println(c2 != c3);
        System.out.println((c1 / 2) <= (c4 * c4));
        
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(c4 == (c4*6));
        System.out.println(c2*2 != c3);
        System.out.println((c1%9) > (c4 * c4));

        // 5. Utiliza el operador lógico and.
        System.out.println(c1 == (c3 - 4) && c2 * 2 == c3);
        System.out.println(c4 * 11 == c2 + c3 && (c1 - c3) * 2 > c2);
        System.out.println(c4 >= c1 / 9 && c1 * c3 != c4 * 6);

        // 6. Utiliza el operador lógico or.
        System.out.println(c1 != c2 || c4 == (c3 - c2 + 1));
        System.out.println(c4 > c1 || c3 == c1);
        
        

        // 7. Combina ambos operadores lógicos.
        System.out.println((c1 > c4 || c3 / 2 < c1 % 5) && (c1 != 9));
        
        // 8. Añade alguna negación.
        System.out.println((c1 > c4 || c3 / 2 < c1 % 5) && !(c1 != 9));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int d1 = 10;
        int d2 = -5;
        
        System.out.println(-d2);
        System.out.println(-d1);
        System.out.println(d1++);
        System.out.println(d1);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        int e1 = 4;
        int e2 = 6;
        int e3 = 8;
        int e4 = 12;

        System.out.println(((e4 <= e1 * 3) || (e1 * e1 > e4 * e1)) && (!(e1 + e2 == e3) || (e4 != e2 + e3)));
    }
}
