package OOP;

import java.util.ArrayList;

/**
 * * Esta forma fue algo que se me ocurrio para reolsver el problema 8
 * * usando un ArrayList y pasando el metodo mostrarSalario("elNombreDelEmpleado")
 * 
*/

/**
 * ! Cómo organizar la clase para que sea fácil de entender (sacado de ChatGPT)
 * Cuando estás aprendiendo, puedes seguir este orden dentro de la clase:
 * 
 * Atributos (variables de la clase)
 *  - Se definen primero porque los métodos y constructores van a usar esas variables.
 *  - Ejemplo: String nombre; double salario; private static ArrayList<Worker2> misEmpleados;
 * Bloques estáticos (si tienes inicialización global)
 *  - Código que se ejecuta automáticamente al cargar la clase. Se ejecutan cuando se carga la clase, antes de cualquier objeto.
 *  - Por eso se colocan arriba: así el lector sabe que hay inicialización global antes de crear objetos.
 * Constructor(es)
 *  - Se define antes de los métodos porque los objetos se crean con el constructor, y los métodos no están disponibles hasta que el objeto existe.
 *  - Es lógico para quien lee el código: primero se crean los objetos, luego pueden usar métodos.
 * Métodos no estáticos (comportamiento individual de cada objeto)
 *  - Comportamiento individual del objeto.
 *  - Se colocan antes de los métodos estáticos para que, cuando alguien lea la clase, vea primero cómo funciona un objeto antes de cómo se maneja la clase completa.
 * Métodos estáticos (comportamiento de clase, como buscar en la lista)
 *  - Comportamiento global o de “clase”.
 *  - Se colocan al final porque operan sobre muchos objetos o listas globales, y generalmente usan los métodos no estáticos de los objetos.
*/

// * Se enumerara el Flujo con un System.out.println("");
// * Flujo completo en la line:111 
public class Worker2 {

    // * Atributos
    String nombre;
    double salario;

    // * Creacion del ArrayList de los empleados
    /**
     * El ArrayList debe ser privado para evitar que desde el otro archivo (ClassesOPPExcerscises.java) se puedan hacer operaciones cono clear() , etc.
     * De esta forma nos aseguramos que no se pueda borrar o acceder directmante al array desde fuera.
     * 
     * Es estacic porque queremos que la lista contenga todos los trabajadores de la clase, no uno por cada objeto.
     * Que significa static? que pertenece a la clase, y no a los objetos individuales.
     * 
     * OJO el metodo tambien debe ser estatic ya que no pertenece a un objeto específico, sino a la clase Worker2.
     * Por eso puede usar directamente empleados, que también es static.
     * Se inicializa una sola vez
     * Cuando se carga la clase, Java crea la lista empleados
     * No importa cuántos objetos Worker crees, siempre es la misma lista compartida.
     * 
     */
    private static ArrayList<Worker2> misEmpleados = new ArrayList<>();
    // Bloque de inicialización de instancia
    {
        System.out.println("Paso 2: Atributos del objeto listos");
    }

    // * Bloque estatico
    /**
     * Bloques estáticos (si tienes inicialización global)
     *  - Código que se ejecuta automáticamente al cargar la clase. Se ejecutan cuando se carga la clase, antes de cualquier objeto.
     *  - Por eso se colocan arriba: así el lector sabe que hay inicialización global antes de crear objetos
     * 
     * Osea si existe se ejecuta al momento de crear la clase, antes de los atributos
     */
    static {
        System.out.println("Paso 1.- Clase Worker2 cargada: lista de empleados creada");
    }

    // * Constructor
    /**
     * El constructor debe recibir como parametros el nombre y salario de la lista, 
     * por lo que debeos de poner un misEmplados.add(this)
     * para que al momento de agerar un empleado a la lista se pase por el contructor y sea "leido"
     * 
     */
    public Worker2(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        // Cada vez que se crea un objeto de tipo Worker2, se agrega a la lista
        misEmpleados.add(this);
        System.out.println("Paso 3.- Constructor: Se creó " + nombre);
    }

    // * Metodo no estatico
    /**
     * Este metodo sirve para mostrar el salario del trabajador
     */
    public void mostrarSalario2() {
        System.out.println("Paso 5.- (Metodo no estatico) El salario de " + nombre + " es de $" + salario);
    }

    // * Metodo Estatico
    /**
     * Este metodo sirve para buscar por nombre (recorrer el array) y mostrar el salario
     */
    public static void mostrarSalario2(String nombre) {
        System.out.println("Paso 4.- (Metodo estático) Buscando a " + nombre);
        for (Worker2 worker2 : misEmpleados) {
            if (worker2.nombre.equals(nombre)) {
                worker2.mostrarSalario2();
                return;
            }
        }
        System.out.println("Empleado no encontrado :(");
    }


    /**
     * * Flujo de ejemplo, los valores en el archivo main SON distintos:
     * 
     * Se carga la clase Worker2
     * Atributos Listos
     * main()
     * ├─ new Worker2("Dio") → Constructor
     * ├─ new Worker2("JoJo") → Constructor
     * ├─ Worker2.mostrarSalario2("Dio") → Método estático
     * │      └─ w.mostrarSalario2() → Método no estático
     * └─ Worker2.mostrarSalario2("Jose") → Método estático → no encuentra
     * 
     * 
     * Paso 1.- Clase Worker2 cargada: lista de empleados creada
     * Paso 2.- Atributos del objeto listos
     * Paso 3.- Constructor: Se creó Dio
     * Paso 2.- Atributos del objeto listos
     * Paso 3.- Constructor: Se creó Jojo
     * Paso 4.- (Metodo estático) Buscando a Dio
     * Paso 5.- (Metodo no estatico) El salario de Dio es de $2000000.0
     * Paso 4.- (Metodo estático) Buscando a Jose 
     * Empleado no encontrado :(
     * 
     * 
     * Clase Worker2 cargada (bloque estático Paso 1)
     * main()
     * ├─ new Worker2("Dio")
     * │      ├─ Bloque de atributos (Paso 2)
     * │      └─ Constructor (Paso 3)
     * ├─ new Worker2("JoJo")
     * │      ├─ Bloque de atributos (Paso 2)
     * │      └─ Constructor (Paso 3)
     * ├─ Worker2.mostrarSalario2("Dio")
     * │      ├─ Método estático (Paso 4)
     * │      └─ Método no estático (Paso 5)
     * └─ Worker2.mostrarSalario2("Jose")
     *       └─ Método estático (Paso 4) → no encuentra
     * 
     */
}
