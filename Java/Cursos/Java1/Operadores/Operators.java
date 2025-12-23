package Operadores;
public class Operators {

    /** 
     * @SuppressWarnings("unused")
     * !es una anotación en Java que le dice al compilador que ignore las advertencias sobre variables, 
     * !métodos o campos que no se utilizan en el código, permitiéndote suprimir mensajes del compilador 
     * !para código que sabes que es intencionalmente no usado, aunque generalmente se recomienda 
     * !eliminar ese código en lugar de ignorarlo. 
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // * Operadores

        // * Aritmeticos

        var a = 5;
        var b = 6;

        System.out.println(a + b); // Suma
        System.out.println(a - b); // Resta
        System.out.println(a * b); // Multiplicacion
        System.out.println(a / b); // Division
        System.out.println(a % b); // Modulo (Es el restante de una division, por ejemplo: 5 entre 3, el 3 cabe solo una vez y el modulo (el sobrante) es dos.)

        /**
         * Si modificamos el tipo de dato de una variable, los resultados seran del tipo mas "grande" por asi decirlo, si tenemos int y a una le ponemos double,
         * el resultado sera de tipo double (osea decimal)
         */
        double c = 5;
        var d = 6;

        System.out.println(c + d); // Suma
        System.out.println(c - d); // Resta
        System.out.println(c * d); // Multiplicacion
        System.out.println(c / d); // Division
        System.out.println(c % d); // Modulo (Es el restante de una division, por ejemplo: 5 entre 3, el 3 cabe solo una vez y el modulo (el sobrante) es dos.)

        // * Asignacion

        a = 1000;
        System.out.println(a);

        a = b;
        System.out.println(b);

        a = b * 33;
        System.out.println(a);

        a += 1; // a = a + 1
        System.out.println(a);

        a -= 2; // a = a - 2
        System.out.println(a);

        a *= 3; // a = a * 3
        System.out.println(a);

        a /= 4; // a = a / 4
        System.out.println(a);

        a %= 5; // a = a % 5
        System.out.println(a);

        // * Comparación (Relacionales)

        System.out.println(a == b); // es a igual a b?
        System.out.println(a == 6); // es a igual a 6?
        System.out.println(a == 2); // es a igual a 2?

        System.out.println(a != b); // es a distinto de b?
        System.out.println(a != 2); // es a distinto de 2?

        System.out.println(a > b); // es a mayor que b?
        System.out.println(a >= b); // es a mayor o igual que b?
        System.out.println(a < b); // es a menor que b?
        System.out.println(a <= b); // es a menor o igual que b?

        // * Logicos

        /**
         *  * Tablas de verdad
         *  
         *  * Conjuncion Y : Devuelve true cuando la primera Y la segunda condicion se cumplen
         *  * Conectivo: ^
         *  * Operador: AND
         *  * Nomenclatura: &&
         *      p   q   p ^ q
         *      V   V     V
         *      V   F     F
         *      F   V     F
         */
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println("-------");
        System.out.println(3>2 && 10 == 20/2); // true && true = true
        System.out.println(3>2 && 10 == 2); // false && false = false

        /**
         * * Tablas de verdad
         * 
         * * Disyuncion O : Devuelve true cuando la primera O la segunda condicion se cumplen
         * * Conectivo: v
         * * Operador: OR
         * * Nomenclatura:  ||
         *      p   q   p v q
         *      V   V     V
         *      V   F     V
         *      F   V     V
         *      F   F     F
         */
        System.out.println(true|| true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println(3 > 2 || 10 == 2); // true || false = true
        
        /**
         * * Negacion NO : Devuelve la negacion del estado actual. Resulta en verdadero cuando su operando es falso y viceversa
         * * Conectivo : ¬
         * * Operdaror: NOT
         * * Nomenclatura: !
         *      p   ¬p
         *      V   F
         *      F   V
         */
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println((3 > 2) || 10 == 2); // true || false = true
        System.out.println(!(3 > 2) || 10 == 2); // false || false = false

        // * Unarios
        a = 2;
        b = 6;

        /**
         * Podria decirse que los operadores unarios (+) y (-) cambian el estado de una variable numerica Ya sea positivo o negativo.
         * Multiplicacion de signos 
         * (+) * (+) = (+)
         * (+) * (-) = (-)
         * (-) * (+) = (-)
         * (-) * (-) = (+)
         */
        System.out.println(+a); // 2  
        System.out.println(-a); // -2

        a = -2;
        System.out.println(+a); // -2  
        System.out.println(-a); // 2

        /**
         * Los operadores unarios (++) y (--) hacen un incremento en el valor de la variable.
         * Y depende de donde se pongan, hace primero el incremento o imprime el valor
         * (++b) = 7 
         * Pero si es al revez, (b++) = 6, y tendriamos que volver a imprimir b para que se actualice a 7
         */
        System.out.println(++b); // 7

        b = 6;
        System.out.println(b++); // 6
        System.out.println(b); // Ahora si es 7

        b = 6;
        System.out.println(--b);

        b = 6;
        System.out.println(b--); // 6
        System.out.println(b); // Ahora si es 5

        /**
         * ! Como son variables, cada que modificamos el valor de estas se sobreescribe,
         * ! por lo que hay que tener cuidado al hacer operaciones 
         */
    }
}
