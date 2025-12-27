package OOP.AccesModifiers;

public class Person3 {
    
    // 1. Crea una clase Person3 con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.

    // * Atributos
    private String name;
    private int age;
    
    // * Constructor
    /**
     * ! El ejercicio no pide constructor, por lo que java asigna el contructor por defecto "invisible" sin parametros el cual es similar a esto:
     * 
     * public Person3(){
     * 
     * }
     * 
     * Es funcionalmente idéntico al constructor por defecto que Java proporciona automáticamente cuando no defines ninguno.
     * La diferencia:
     * Sin constructor explícito: Java lo crea automáticamente (invisible).
     * Con constructor vacío: Lo escribes tú explícitamente (visible). 
     *
     * * Ahora por que estan los 2 constructores, el vacio y con parametros declarados???
     * El ejercicio específicamente pide usar setters y getters para asignar valores
     * Por lo tanto, no se necesita un constructor con parámetros aquí
     * 
     * Cuándo usar cada uno:
     * Constructor sin parámetros (este caso):
     * Cuando el ejercicio pide usar setters/getters
     * Cuando necesitas flexibilidad en la inicialización
     * Constructor con parámetros:
     * Cuando necesitas garantizar que un objeto se cree con valores válidos
     * Cuando es más conveniente: new Person3("Juan", 25)
     * Ejercicios como el #4 (Book) que piden "El título debe asignarse solo por el constructor"
     * Ambos: (buena práctica profesional)
     * 
     * Escribir un constructor vacío explícitamente sirve para:
     * Hacerlo visible en el código (documentación)
     * Dejar claro que lo pensaste conscientemente
     * Pero agrega código innecesario que Java ya proporciona
     * 
     * * Entonces por que declaro los 2 XD ??
     * Tener los 2 constructores nos da mas flexibilidad a la hora de crear objetos, 
     * ya que NO perdemos el contructor por defecto al crear el otro con parametros y nos da las siguientes opciones al crear objetos
     * OPCION 1: Crear un objeto como pide el ejercicio:
     * 
     * Person3 miPersona = new Person3();  // Sin parámetros
     * miPersona.setName("JOJO");
     * miPersona.setAge(89);
     * 
     * OPCION 2: Crear el objeto con el constructor y con los parametros que deben ser, ademas es mas rapido ( 1 linea vs 3 o mas linas)
     * 
     * Person3 miPersona = new Person3("JOJO", 89);  // Con parámetros
     *  
     */
    // * Constructor por Defecto (sin parametros) declarado
    public Person3() {

    }

    // * Constructor con parametros declarado
    public Person3(String name, int age) {
        this.setName(name); // Uso de Setters
        this.setAge(age); // Uso de Setters
    }

    // * Setters y Getters
    /**
     * 
     * Ya que los atributos son privados
     * 
     * private String name;
     * private int age;
     * 
     * Getters
     * Propósito: Recuperar el valor de un atributo privado.
     * Convención: Método público que retorna el tipo del atributo, con el prefijo get (ej. getNombre()).
     * Ejemplo: public String getNombre() { return this.nombre; }
     * * Nota: también es válido usar sin this : return nombre; 
     * 
     * 
     * Setters
     * Propósito: Asignar un nuevo valor a un atributo privado, pudiendo incluir validaciones.
     * Convención: Método público void (no retorna nada) que recibe el nuevo valor como parámetro, con el prefijo set (ej. setNombre(String nuevoNombre)).
     * Ejemplo: public void setNombre(String nombre) { this.nombre = nombre; }. 
     * * Nota: Los setters pueden incluir validaciones antes de asignar el valor. Como en Person2.java 
     * 
     * Metodo auxiliar del tipo set
     * public void setAge(int age) {
     *     if (age > 0) {
     *          this.age = age;
     *      } else {
     *          System.out.println("Edad negativa");
     *      }
     * }
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
