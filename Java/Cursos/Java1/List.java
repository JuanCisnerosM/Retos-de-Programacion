import java.util.ArrayList;

public class List {
    
    public static void main(String[] args) {
        /**
         * * Array vs List  (Arreglos vs Listas)
         * Un List (ArrayList) una solucion mas flexible que el Array,
         * Array: tamaño fijo, acceso más rápido, sintaxis simple. No permite crecer o reducir.
         * List (java.util.List): tamaño dinámico, más flexible, provee métodos como add(), remove(), contains().
         * Internamente suele ser un ArrayList (respaldo con arreglo), pero con gestión automática de tamaño.
         * Usar Array cuando el tamaño es conocido y no cambia.
         * Usar List cuando necesitas agregar, quitar o manipular elementos con más libertad.
         */
        // * Declaracion y creacion
        ArrayList<String> names = new ArrayList<>();

        /**
         * Existen 2 formas de declarar un ArrayList:
         * 
         * ArrayList<String> names = new ArrayList<>();      equivale a       var names = new ArrayList<String>();
         * var toma el tipo exacto del lado derecho.
         * Como estás usando new ArrayList<String>(), el compilador infiere que names es de tipo ArrayList<String>.
         * 
         * La implenetacion de String es una clase, en java todos los tipos de datos primitivos tienen su equivalente en objeto (clase)
         * 
         * int = Integer
         */
        var numbers = new ArrayList<Integer>(); // Equivale a   ArrayList<Integer> numbers = new ArrayList<>();

        // * Checar el tamaño de la lista de arrglos (ArrayList)
        System.out.println(names.size());

        // * Añadir elementos al ArrayList
        /**
         * A diferencia de los Arrays que ya se definen el tamaño y su contenido,
         * Aqui vamos agregando a placer mas "cajas" para agregar contenido con el " .add("Contenido") "
         * 
         * Son estructuras ordenadas por orden de llegada
         */
        names.add("John"); // Agrego un objeto de tipo String al ArrayList entonces el tamaño aumento
        names.add("Wizard");
        names.add("Kioken");
        numbers.add(3);

        System.out.println(names.size());

        // * Acceder a los elementos del ArrayList
        /**
         * Para obtener los elemtenos es diferente que los Arrays, en los cuales usabamoos los [], para acceder a los elementos
         * Aqui se usa el ".get(X)" para obtener el dato del indice X
         * Tambien esta el .getFirst() para obtener el primer elemento , y el .getLast() para obtener el ultimo elemento.
         */
        System.out.println(names.get(0));

        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));

        // * Modificar elementos
        /**
         * Para modificar usamoe el "  .set(index, contenido)"
         */
        names.set(0, "Wazaaaa"); // Modificamos el contenido del indice 0
        System.out.println(names.get(0));
        
        // * Eliminar
        /**
         * En los Arrays no podemos eliminar ya que al usar Arrays debemos estar concientes desde un inicio el tamaño que debe tener el arreglo.
         * Para esto en los ArrayList se usa .remove(indice)
         * ! Al eliminar un indice en el medio los que estan a su derecha se recorren,
         * Por ejemplo eliminamos el indice (4), lo que pasa e que el 5 pasaria a ser el 4, el 6 pasaria a ser el 5
         * 
         * Ahorita tenemos esto, 3 elementos
         * names.add("John"); 
         * names.add("Wizard");
         * names.add("Kioken");
         * 
         * Borraremos el indice 1 (osaa "Wizard")
         */
        names.remove(1);
        System.out.println(names.size()); // Ahora solo tenemos 2 elementos, pero que pasa si acceso al indice 1 que borramos?
        System.out.println(names.get(1)); // ahora el indice 2 pasa a ser el 1, en este caso Kioken pasa a ser el nuevo indice 1

        // * Buscar elementos
        /**
         * Esto se hace con el .contains("Contenido")
         * Como en el archivo Strings.java, nos va a regregar un true o false
         */
        System.out.println(names.contains("Wazaaaa"));
        System.out.println(names.contains("Wizard")); // recueda que lo borramos con remove

        // * Limpiar el ArrayList
        /**
         * Borra todo el contenido por lo que deja el ArrayList vacio, size=0
         */
        System.out.println(names.size());
        System.out.println(names);
        names.clear();
        System.out.println(names.size());
        numbers.size();
        System.out.println(numbers.size());
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers.size());
    }
}
