package OOP;

public class Person {
    
    // * Atributos
    /**
     * Son las Variables que definen el estado, caracteristricas del objeto.
     */
    String name; // Atributo nombre 
    int age; // Atributo edad

    // * Metodo Constructor
    /**
     * Es un mecanismo de inicializacion
     */
    public Person(String name, int age) {
        // Establecer la ralacion con las propiedades internas de la clase, this.name hace referencia a los Atributos de la clase y name hace referencia al constructor
        this.name = name;
        // Establecer la ralacion con las propiedades internas de la clase, this.age hace referencia a los atributos de la clase, y age hace referencia al contrunctor
        this.age = age;
        /**
         * ! Yo aqui pudieroa cambiar el nombre de las variables del contructor pero las buenas practicas dice que deben de llevar el mismo nombre
         * Siendo esto valido pero sin buenas practicas:
         * 
         * public Person (String miNombre, int miEdad){
         *     this.name = miNombre;
         *     this.age = miEdad;
         * }
         * 
         * 
         *  */
    }

    // * Metodos
    /**
     * Son las Funciones quie definen el comportamiento del objeto.
     */
    public void sayHello() {
        System.out.println("Hola soy " + name + " y tengo " + age + " años");
    }
}
