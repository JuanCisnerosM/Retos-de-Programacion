public class Arrays {
    
    public static void main(String[] args) {

        // * Declaracion y creacion de un Array (Arreglo)
        /**
         *  Con el uso de corchetes []
         */
        int[] numbers = new int[3]; // * Con este tipo de declaracion estamos reservando X (3) numero de "huecos" para usar despues, pero no le estamos dando valores aun.
        System.out.println(numbers); // A la hora de imprimir pues nos da algo raro, ejemplo: [I@251a69d7, por que dice que hay algo pero no sabe que es

        String[] names = { "Jojo", "Giorno", "Metallica" }; // * Aqui si estamos dando el arreglo y cuantas posiciones contiene, por lo que si metemeos mas nombres, se hace mas grande el arreglo
        System.out.println(names); // Aqui igual que en el de arriba hay algo pero no sabe que es, ejemplo [Ljava.lang.String;@7344699f. Pero nos dice que es de tipo String, arriba nos deia que es de tipo I (integer quiza?)

        String[] names2 = new String[3]; // * En este caso, creamos un arreglo similar al de arriba pero solo "reservamos" X numero de huecos como en el primero, (si se observa se parecen mucho), 
        System.out.println(names2[0]); // A la hora de imprimir un arreglo de tipo string, en este caso tenemos 3 huecos, pero solo estan declarados, tendriamos algo asi: [], [], [] no contiene nada, si al momento de imprimir le pasamos una posicion (indice), nos va a imprimir lo que hay ahi, pero al tener [], [], [], por defecto nos regresara un NULL.

        // * Acceso
        System.out.println(names[0]); // Como en el caso anterior, al poner un indice entre conchetes seguido del arraglo (names[0]), nos imprimie lo que hay en la posicion 0 del arreglo, cono en este caso "Jojo". Pero aqui ya lo tenemos declarado el arreglo al momento de crearlo  { "Jojo", "Giorno", "Metallica" }.

        // * Modificacion
        /**
         * En el caso anterior se accede a la posicion 0 de un arreglo ya deifinido, pero tenemos el primer caso " int[] numbers = new int[3]; ", solo reservamos 3 espacios.
         * Ahora hay que darle valor o "poner algo ahi" para acceder a esos espacios reservados
         */
        numbers[0] = 87; // Asignamos valores a la posicion [0] y a la posicion [1], recordando que el aareglo que creamos es de 3 "huecos"
        numbers[1] = 22;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]); // como no se le asigno nada al espacio 3 del arreglo de "enteros", por defecto, esta en 0.
        
        /**
         * numbers[3] = 2; da error, ya que la longitud del arreglo, ya viene dada, en este caso [3], pero  en el caso de numbers[3],
         * la posicion coresponde al indice 4, porque tenemos [0][1][2]  (ahi estan los 3 espacios que hemos reservado) y [3] (se sale del "rango" ya que es el espacio 4).
         */

        // Tambien podemos modifiar lo que hay dentro la X posicion de un arreglo ya definido
        System.out.println(names[1]); // aqui tenemos en el indice 1 la cadena o palabra "Giorno", porque: String[] names = { "Jojo", "Giorno", "Metallica" };
        names[1] = "Star Platinum"; // Cambiamos el contenido del indice 1.
        System.out.println(names[1]); // Ahora vemos que nos da el nuevo valos que asiganos

        // * En los Arreglos no existe la eliminacion, por que ya estan reservados esos "espacios". Lo que se puede hacer una "Limepieza de esos esapcios reservados"

        /**
         * Los Arreglos cuando no se les "pasa" informacion el lenguaje les da un valor por defecto
         * en el caso de los tipos de datos primitivos es 0, false(si es boolean).
         * en el caso de las cadenas de texto es  NULL
         * 
         *  Y con eso pdriamos "limpar" ese espacio pondiendo el valor por defecto
         */
        int modificacion[] = { 1, 2, 3, 4, 5 };
        System.out.println(modificacion[3]); // imprime el neumero 4 (pocision 3)
        modificacion[3] = 0;
        System.out.println(modificacion[3]); // imprime el neumero 0 (pocision 3)

        int modificacion2[] = new int[5]; // * 5 huecos sin nada dentro, entones por defecto es 0
        for (int i = 0; i < modificacion2.length; i++) {
            System.out.print(modificacion2[i]);

            if (i < modificacion2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(""); // Un pequeño salto de linea

        boolean booleans[] = new boolean[5]; // * 5 huecos sin nada dentro, por lo que al ser booleanos por defecto es false
        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            
            if (i < booleans.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
