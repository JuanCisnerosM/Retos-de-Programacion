package OOP.AccesModifiers;

// Las clases por buena practica siempre son publicas
public class Person2 {

    // * Encapsulamiento (modificadores de acceso)
    /**
     * * Modificadores de acceso:
     * - public : Accesible desde cualquier clase, en cualquier paquete. Es el nivel más amplio de visibilidad.
     * - private : Accesible solo dentro de la misma clase. Protege los miembros más sensibles, implementando un fuerte encapsulamiento.
     * - protected : Accesible dentro de la clase, en el mismo paquete, y por subclases (incluso si están en otro paquete).
     * - default* : Por Defecto (Package-Private): No se usa una palabra clave. Accesible solo por clases dentro del mismo paquete. 
     * - package*
     * 
     * * Tabla Resumen de Acceso
     * 
     * Modificador	    Misma Clase 	Mismo Paquete	Subclase (otro paquete)	Cualquier Clase (otro paquete)
     * public	           Sí	             Sí	                Sí	                        Sí
     * protected	       Sí	             Sí             	Sí                      	No
     * default (paquete)   Sí                Sí             	No                      	No
     * private	           Sí                No             	No                      	No
     * 
    */
    
    // * Atributos
    /**
     * Supongamos que name lo volvemos privado
     * String name; = private String name;
     */
    // String name; 
    // private String name;
    protected String name;
    // Como la edad es unica, osea no puedo tener un dia 10 y el otro -25, no queremos que se acceda a el libremente por lo que lo volvmos private
    // y si lo ponemos final tampoco se va a modificar dentro de la misma clase, tambien se creo un setter para valodad si la edad es valida (edad > 0)
    // int age;
    private int age;
    // Creamos un atributo (default) String id;
    // Pero como el id (digamos el CURP) es "sensible y unico" no queremos que se acceda a el libremente por lo que lo volvmos private
    // y si lo ponemos final tampoco se va a modificar dentro de la misma clase
    // private String id;
    final private String id;

    // * Metodo Constructor
    /**
     * ! MODIFICADOR DE ACCESO
     * * public
     * al ser de tipo  public 
     * public Person2(){} 
     * estamos diciendo que es accedible desde cualquier parte del programa, (desde cualquier parte de la carpeta Java1)
     * 
     * *private
    */
    public Person2(String name, int age, String id) {
        this.name = name;
        // Como creamos un setter con una condicion de tener edad positiva, le pasamos el setAge(con parametro age)
        // his.age = age;
        this.setAge(age);
        this.id = id;
    }


    // * Metodos
    public void sayHello() {
        // this.id = "ASV1243"; // NO SE PUEDE PORQUE YA ES FINAL, caso contrario a los otros dos como name o age
        System.out.println("Hola soy " + name + " y tengo " + age + " años y mi CURP es :" + id);
    }

    
    /**
     * * Getters y Setters
     * Los getters y setters son métodos que controlan el acceso a los atributos (variables) de una clase, 
     * implementando el principio de encapsulamiento: los getters ("obtener") devuelven el valor de un atributo privado, 
     * mientras que los setters ("establecer") modifican ese valor, permitiendo validaciones o lógica adicional antes de cambiarlo. 
     * Se llaman getNombreAtributo() y setNombreAtributo(valor), respectivamente, y son cruciales para un diseño de software seguro y mantenible, 
     * ya que evitan el acceso directo y no controlado a los datos internos de un objeto. 
     * 
     * Getters
     * Propósito: Recuperar el valor de un atributo privado.
     * Convención: Método público que retorna el tipo del atributo, con el prefijo get (ej. getNombre()).
     * Ejemplo: public String getNombre() { return this.nombre; }. 
     * 
     * 
     * Setters
     * Propósito: Asignar un nuevo valor a un atributo privado, pudiendo incluir validaciones.
     * Convención: Método público void (no retorna nada) que recibe el nuevo valor como parámetro, con el prefijo set (ej. setNombre(String nuevoNombre)).
     * Ejemplo: public void setNombre(String nombre) { this.nombre = nombre; }. 
     * 
     * Importancia 
     * Encapsulamiento: Ocultan la lógica interna de la clase, protegiendo los datos.
     * Control: Permiten añadir lógica (validaciones, transformaciones) antes de leer o escribir un dato.
     * Mantenimiento: Facilitan cambios en la implementación interna sin afectar el código que usa la clase. 
     * En resumen, son una práctica estándar en Java para manejar los datos de los objetos de forma segura y organizada. 
    */

    // * Metodo auxiliar de tipo get
    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }


    // * Metodo auxiliar del tipo set
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad negativa");
        }
    }
}