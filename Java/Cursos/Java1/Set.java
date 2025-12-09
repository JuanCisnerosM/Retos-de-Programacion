import java.util.HashSet;

public class Set {
    
    public static void main(String[] args) {
        
        // * Declaracion y creacion de un HashSet
        /**
         * La nomenclatura es casi identica que el de ArrayList
         * 
         * ArrayList<TipoDeVariable> nombreDeVariable = new ArrayList<>();
         * var nombreDeVariable = new ArrayList<TipoDeVariable>();
         * 
         * El HashSet es:
         * 
         * HashSet(TipoDeVariable) nombreDeVariable = new HashSet();
         * var nombreDeVariable = new HashSet<TipoDeVariable>()
         * 
         * * Al igual que el ArrayList puedes crea un HashSet con datos
         * 
         * * Crear un HashSet con datos 
         * 
         * * Forma clásica (mutable, compatible con cualquier Java)
         * * HashSet<TipoDeVariable> nombreDeVariable = new HashSet<>(Arrays.asList("dato1", "dato2", "datoX"));
         * ! Requiere importar  --  import java.util.Arrays;
         * Permite: add, remove
         * No permite duplicados
         * HashSet<String> names3 = new HashSet<>(Arrays.asList("ASAS", "ASASASD"));
         * System.out.println(names3);
         * 
         * * var nombreDeVariable = new HashSet<TipoDeVariable>(List.of("dato1", "dato2", "datoX"));
         * ! Requiere: importar  --  import java.util.List;
         * Permite: add, remove
         * Forma recomendada actualmente
         * var names3 = new HashSet<String>(List.of("dato1", "dato2", "datoX"));
         * System.out.println(names3);
         * 
         * ! EXISTE UNA FORMA INMUTABLE
         * ! PERO ESTA NO LA VAMOS A USAR,
         * 
         * Forma solo inmutable (NO permite cambios)
         * Set<String> set = Set.of("dato1", "dato2", "dato3");
         * No permite add ni remove
         * Lanza excepción si hay duplicados
         * Ideal para constantes
         * 
         * 
         * ---------------------------------------------
         * 
         * * Entonces
         * HashSet NO mantiene orden
         * NO permite elementos duplicados
         * Set.of NO acepta valores repetidos
         * 
         */
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // * Tamaño
        /**
         * Al igual que los ArraList es con nombreDeVariable.size()
         */
        System.out.println(names.size());
        System.out.println(numbers.size());

        // * Añadir elementos
        /**
         * nombreDeVariable.add();
         * ! Los sets no permiten repetidos
         * 
         */
        names.add("John"); // Agrego un objeto de tipo String al HashSet entonces el tamaño aumento
        names.add("Wizard");
        names.add("Kioken");
        names.add("John"); // Vuelvo a agregar John 3 veces mas
        names.add("John");
        names.add("John");
        numbers.add(3);

        // * Acceder a los elementos ?
        /**
         * ! Las listas son ordenadas
         * ! Los HashSet son estructuras desordenadas, lo que ocupa es un Hash para ordenar los elementos sin importar el orden de insercion
         * 
         * * Sepuede decir "HashSet es una colección desordenada de elementos únicos".
         * 
         * ! Por lo que el .get(index);, .getFirst(); y get.Last(); No funciona aqui
         * 
         * ! Los sets a diferencia de los Array o ArrayList no permiten repetidos:
         * * Los HashSet no permiten repetidos ya que el momento de agregar un nuevo elemento podriamos decir que
         * * verifica si ya existe un Hash asociado al elemento que queremos agregar, en el caso de "John" ya existe un hash para ese elemento y no lo vuelve agregar
         * * ni aunque hicieramos un names.add("John"); otras 100 veces
         * 
         */
        System.out.println(names); // lo imprime de la sig manera [Kioken, John, Wizard], pero asi no fue el orden que se metieron

        // * Modificar los elementos ?
        // ! Como al momeneto de acceder no sabemos exactamete donde estan, por ende no vamos a poder modificarlos

        // * Buscar elementos
        /**
         * Al igual que en los ArrayList esto se hace con el .contains("Contenido")
         * Como en el archivo Strings.java, nos va a regregar un true o false
         * 
         * nombreDeVariable.contains("Contenido"); // comillas si es de tipo cadena y sin comillas si es numerico
         * 
         */
        System.out.println(names.contains("Wazaaaa"));
        System.out.println(names.contains("Wizard"));

        // * Eliminar
        /**
         * Al igual que en los ArrayList se hace con nombreDeVariabre.remove();
         * Pero ahora como no tenemos un indice, le debemos pasar el contenido osea: nombreDeVariabre.remove("Contenido");
         */
        names.remove("Wizard");

        System.out.println(names.contains("Wizard"));
        System.out.println(names);

        // * Conjuntos
        /**
         * Podemos crear conjuntos y hacer operaciones de conjunots con los HashSet diferents pero que compartan el mismo tipo de dato (ya sea String, o Integer, etc.)
         * 
         * nombreDeVariable1.addall(numbreDeVariable2);
         * 
         * Lo que hace es que ahora el conjunto1 va a contener el conetido del conjunto 1 y el 2 
         * names  = [Kioken, John]
         * names2 = [Pepe el pollo, Ki ko ho, Papoi]
         * 
         * entonces names contendria = [Kioken, John, Pepe el pollo, Ki ko ho, Papoi]  (no en ese orden especificamente)
         */
        System.out.println(names);

        /**
         * juntar 2 conjuntos en 1 osea una especie de full join donde  A = A u B
         * Creamos un HashSet nuevo
         */
        HashSet<String> names2 = new HashSet<>();
        names2.add("Pepe el pollo"); // Agrego un objeto de tipo String al HashSet entonces el tamaño aumento
        names2.add("Papoi");
        names2.add("Ki ko ho");

        System.out.println(names2);

        names.addAll(names2);

        System.out.println(names); // [Pepe el pollo, Kioken, John, Ki ko ho, Papoi]

        System.out.println("El conjunto 1 ahoroa tiene: " + names + " y el Conjunto 2 tiene: " + names2);

        /**
         * Eliminar del conjunto 1 lo que coincida con el conjunto 2
         * tenemos que  El conjunto 1 ahoroa tiene: [Pepe el pollo, Kioken, John, Ki ko ho, Papoi] y el Conjunto 2 tiene: [Pepe el pollo, Ki ko ho, Papoi]
         * Osea una especie de Left Join donde A = A - B
         */
        names.removeAll(names2);
        System.out.println("El nuevo conjuento 1 despues de eliminar lo coincide con el conjunto 2" + names);

        /**
         * Traer lo que coincida del conjunto A con B como un inner Join
         * Una espeice de inner Join A = A ^ B 
         * creamos barca2010 y barca2018 para el ejemplo,  
         * donde barca2010 contendra los nombres del barca de 2010
         * y barca2018 los nombres del barca de 2018
         */
        HashSet<String> barca2010 = new HashSet<>();
        barca2010.add("Valdes"); // 
        barca2010.add("Pique");
        barca2010.add("Alba");
        barca2010.add("Iniesta");
        barca2010.add("Xavi");

        System.out.println("Nombres del Barca2010: " + barca2010);

        HashSet<String> barca2018 = new HashSet<>();
        barca2018.add("Ter Stegen"); // 
        barca2018.add("Pique");
        barca2018.add("Alba");
        barca2018.add("De Jong");
        barca2018.add("Iniesta");

        System.out.println("Nombres del Barca2018: " + barca2018);

        // Del barca de 2010 que jugadores todavia juegan en 2018 en Barca
        barca2010.retainAll(barca2018);
        System.out.println("Los Jugadores del Barca 2010 que repiten en 2018 son" + barca2010);


        /** 
         * ! HashSet en Java es una colección que implementa la interfaz Set, almacenando elementos únicos (sin duplicados) y sin mantener un orden específico, 
         * ! ideal para operaciones rápidas de búsqueda, adición y eliminación gracias a su estructura de tabla hash. 
         * ! Se usa para manejar conjuntos de datos donde no importa el orden y la unicidad es crucial, 
         * ! utilizando métodos como add() para insertar y contains() para verificar la existencia de un elemento. 
         * 
         * * Características clave de HashSet
         * 
         * No Duplicados: No permite agregar el mismo elemento más de una vez; si se intenta, el método add() devuelve false y no hace nada.
         * 
         * Sin Orden: Los elementos no se almacenan en el orden en que se insertan, y este orden puede cambiar.
         * 
         * Rendimiento: Ofrece operaciones muy rápidas (tiempo constante en promedio) para add(), remove() y contains().
         * 
         * Internamente: Utiliza un HashMap para almacenar los elementos, usando sus códigos hash para determinar la ubicación.
         * 
         * No es Thread-Safe: No es seguro para hilos (multi-hilo); se necesita sincronización externa para usarlo en entornos concurrentes. 
         */
        
    }
}
