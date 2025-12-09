import java.util.HashMap;

public class Maps {
    
    public static void main(String[] args) {

        // * Declaracion y creacion del HashMap
        /**
         * Tablas clave - valor
         * 
         * HashMap<tipoDeVariable, tipoDeVariable> nombreDeVariable = new HashMap<>();
         * var nombreDeVariable = new HashMap<TipoDeVariable, tipoDeVariable>(); 
         * 
         * * Debemos declarar 2 tipos de datos, uno para la clave y otro para el valor
         * 
         * * Al igual que el ArrayList y HashSet puedes crea un HashMap con datos
         * 
         * * Forma clásica (mutable, compatible con cualquier Java)
         * * HashMap<TipoDeVariable, TipoDeVariable> nombreDeVariable = new HashMap<>(Map.of(1, "dato1", 2, "dato2", 3, "dato3"));
         * ! Requiere: import java.util.Map;
         * Permite: put, remove, replace
         * HashMap<Integer, String> names3 = new HashMap<>(Map.of(1, "dato1", 2, "dato2", 3, "dato3"));
         * System.out.println(names3);
         * 
         * * Forma 2 con var
         * *var nombreDeVariable = new HashMap<TipoDeVariable, tipoDeVariable>(); 
         * ! Requiere importar import java.util.HashMap; import java.util.Map;
         * var mapa = new HashMap<Integer, String>(Map.of(1, "A", 2, "B", 3, "C"));
         * System.out.println(names3);
         * 
         * 
         *         
         * ! EXISTE UNA FORMA INMUTABLE
         * ! PERO NO LA VAMOS A VER
         * 
         * Forma solo inmutable (NO permite cambios)
         * Map<Integer, String> mapa = Map.of(1, "dato1", 2, "dato2", 3, "dato3");
         * No permite put ni remove
         * Ideal para catálogos fijos
         * 
         * 
         * 
         * --------------------------------------------
         * * Entonces
         * HashMap NO mantiene orden
         * Las claves NO se repiten
         * Map.of NO permite claves duplicadas
         * 
         * 
         */

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // * Tamaño
        /**
         * * Al igual que las listas y los Sets (HashSet) los mapas tienen la misma "operacion" para saber el tamaño.
         *
         *   Esto se hace con nombreDeVariable.size()
         */
        System.out.println("EL tamaño de el mapa names es de: " + names.size()); // En este caso esta vacio osea nos devuelve un 0

        // * Añadir elementos
        /**
         * 
         */
        names.put("John", "john@abc.com");
        names.put("Cami", "cami@abc.com");
        names.put("Rukia", "rukia@abc.com");
        System.out.println("Ahora el tamaño es de: " + names.size());
        System.out.println("Y lo que contiene en la tabla clave-valor es: " + names);

        numbers.put(1, "Jorge");
        numbers.put(2, "Giorno");
        numbers.put(3, "SS");
        numbers.put(3, "Hawai"); // ! Vemos que el HashMap sobreescribe datos clave-valor existentes.
        System.out.println("El contenido del mapa numbers es: " + numbers);

        /**
         * ! Como su nombre dice son de tipo Hash, por lo que no sabemos la posicion en la que fueron ingresados de los elementos,
         * Notese que el primero que agregamos fue John, pero la salida dio: {Cami=cami@abc.com, John=john@abc.com, Rukia=rukia@abc.com}
         * 
         */

        // * Acceder a los elementos
        /**
         * * En este caso si podemos acceder a los elementos porque tenemos la clave-valor, porlo que si podemos saber que valor hay en clave X.
         * se hace con : nombreDeVariable.get("clave")
         */
        System.out.println("El valor en names es : " + names.get("Cami"));
        System.out.println("El valor en numbers es : " + numbers.get(3));

        // * Verificar que existe el elemento
        /**
         * Para verificar si existe una clave (nos devualve un true o false)
         * Se hace con nombreDeVariable.containsKey("clave")
         * 
         * Para saber si existe el valor se ocupa  nombreDeVariable.containsValue("valor")
         */
        System.out.println(names.containsKey("Rukia")); // true
        System.out.println(names.containsKey("Ichigo")); // false
        System.out.println(numbers.containsKey(1)); // true

        System.out.println(names.containsValue("john@abc.com")); // true
        System.out.println(names.containsValue("ichigo@abc.com")); // false
        System.out.println(numbers.containsValue("SS")); // false por que se reescribio

        // * Eliminar
        /**
         * Para eliminar elementos se hace el valor de la llave (key) con nombreDeVariable.remove("key") 
         * pero tambien existe con los dos la llave y el valor con nombreDeVariable.remove("key", "value")
         */
        System.out.println(names); // antes de eliminar 
        System.out.println(names.remove("John")); // Esta es una forma de borrar con seguridad por si se necesita usar ese valor antes de eliminar.
        System.out.println(names); // despues de eliminar el objeto con llave : Jhon.

        // * Limpiar todo el HashMap
        names.clear();
        System.out.println(names);
        numbers.clear();
        System.out.println(numbers);

        // * Remplazar volores ya existentes
        names.put("John", "john@abc.com");
        names.put("Cami", "cami@abc.com");
        names.put("Rukia", "rukia@abc.com");
        System.out.println("Ahora el tamaño de name es de: " + names.size());
        System.out.println("Y lo que contiene en la tabla clave-valor es: " + names);

        // * Remplazar valor solo SI existe
        /**
         * * Para remplazar valores (solo el valor, no la llave) ya existentes usamos nombreDeVariable.replace("clave", "nuevovalor");
         * ! No podemos remplazar un valor que no existe
         * 
         * Tambien existe el nombreDeVariable.replace("clave","aniguivalor", "nuevovalor")
         */
        names.replace("John", "hans@correo.com"); // John=john@abc.com  ahora sera John=hans@correo.com
        names.replace("Jonas", "jonas@correo.com"); // ! No existe por lo que no puede remplazar nada.
        System.out.println(names);

        // * Agregar un elemento solo si NO exsite
        /**
         * * Para esto existe el nombreDeVariable.putIfAbsent("clave", "valor");
         */
        names.putIfAbsent("Jonas", "jonas@correo.com");
        System.out.println(names);

        // * Otras Operaciones
        System.out.println(names.isEmpty()); // Verifica si el HashMap esta vacio, retornando un true o false
        System.out.println(names.values()); // Imprime la coleccion (una lista (por el uso de corchetes)) de solo los valores, mas no la llave [cami@abc.com, hans@correo.com, rukia@abc.com, jonas@correo.com]

    }
}
