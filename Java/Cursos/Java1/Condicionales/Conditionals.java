package Condicionales;
public class Conditionals {

    public static void main(String[] args) {
        
        // * Condicionales 

        // * if

        /**
         * Java peromite tomar un camino u otro dependiednto la condicion (if)
         * (if) si ..... (si se cumple)
         * (else) entonces... (si no se cumple entonces )
         * 
         * (if) si ..... (si se cumple)
         * (else if) entonces si... (si no se cumple la 1ra condicion ntonces .... si se umple esto....)
         * (else) emtpmces... (si no se umple la 2da condicion entonces .....)
         */
        var age = 18;

        if (age > 18) {
            System.out.println("Es mayor de edad");
        } else if (age == 18) {
            System.out.println("Apenas acaba de cumplir 18");
        } else {
            System.out.println("Es menor de edad");
        }

        // * Switch
        /**
         * Diferentes casos
         * Mas optimo en tiempo de ejecucion al comprobar varias condicones o casos
         */

        var day = 6;

        switch (day) {
            case 1:
                System.out.println("es Lunes");
                break;
            case 2:
                System.out.println("es Martes");
                break;
            case 3:
                System.out.println("es Miercoles");
                break;
            case 4:
                System.out.println("es Jueves");
                break;
            case 5:
                System.out.println("es Viernes");
                break;
            default:
                System.out.println("No es dia habil");
                break;
        }
        
        /**
         * ! Cuando usar un (if) y cuando usar un (switch) ?
         * Usa if para evaluar condiciones complejas y rangos (booleanas, comparaciones) 
         * y switch para seleccionar entre múltiples valores fijos de una misma variable (enteros, caracteres, enums) para mejorar legibilidad y eficiencia, 
         * ya que switch es más rápido que muchos if-else if anidados, siendo el if más versátil para lógica general y switch ideal para menús o estados específico
         */
    }
}
