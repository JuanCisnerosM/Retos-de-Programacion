package OOP.AccesModifiers;

public class AccessModifiers {
    
    public static void main(String[] args) {
        
        // * Encapsulamiento (modificadores de acceso) 
        // ! REVISAR CON MAS CALMA
        // * La practica seria hacerlo todo privado y en funcion de lo que se necesite ir "subiendo o abriendo" los modificadores.

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

        // ! Para ese ejemplo trabajaremos on Person2.java
        var persona = new Person2("GiornoG iovana", 23, "AAAA123");

        persona.sayHello();


        /**
         * ! private 
         * 
         * String name; = private String name;
         * 
         * al encapsular el tipo de dato a privado, ya no nos permite modificar ni acceder al atributo desde otra clase
         * ni de la forma persona.name = "";
         * ni tampoco de la forma System.out.println(persona.name); 
         * 
         * ! protected
         * 
         * Al volverlo de tipo protected, si puede acceder a el directo. (Vease la tabla Resumen de Acceso).}
         * 
         * protected Strinf name;
         */
        // persona.name = "Dio Brando";

        // System.out.println(persona.name);

        // Creamos un atributo (default) String id;
        // Pero como el id (digamos el CURP) es "sensible y unico" no queremos que se acceda a el libremente por lo que lo volvmos private
        // persona.id "1234A";

        var persona2 = new Person2("Jonathan Joestar", 35, "BBBB123");
        persona2.sayHello();





        // * getters and setters
        /**
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

        // ! NO PODEMOS ACCEDER AL ATRIBUTO COMO PROPIEDAD
        // System.out.println(persona.name);

        /**
         * * Getter
         * * Para ello creamos un getter para acceder o "devolver" el valor 
         * public String getId() {
         *     return id;
         * }
         */
        // De esta forma pomemod hacer un 
        System.out.println(persona.getId()); // Obtener el id (CUPR) de persona

        /**
         * *Setter
         * Este es un metodo que sirve para settear o establecer datos
         * una persona no puede tener edad negativa
         */
        var persona3 = new Person2("Cinthya", -25, "CCCCC123"); // Hola soy Cinthya y tengo -25 años y mi CURP es :CCCCC123 (antes del setter)
        persona3.sayHello();
        // Despues del setter
        // Edad negativa
        // Hola soy Cinthya y tengo 0 años y mi CURP es :CCCCC123

        // Con el set asignamos valor valido a persona3 y con el get, nos devuelve la edad (verificamos si el setAge() funciono)
        persona3.setAge(26);
        System.out.println(persona3.getAge());
        

        
    }

}
