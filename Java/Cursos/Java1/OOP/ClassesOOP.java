package OOP;

public class ClassesOOP {
    
    public static void main(String[] args) {

        var persona = new Person("GiornoG iovana", 23);

        /**
         * Al momento de crear al Metodo Constructor nos obliga a meter los "parametros" dentro de la instancia
         * por lo uq eno podemos dejarlo como estaba antes:
         * 
         * var persona = new Person();
         * 
         * Ya que el constructor es el que "dice" que parametros debe llevar. en este caso en Person.java
         * el Constructor nos "pide" un nombre y una edad 
         * 
         * public Person(String name , int age) {
         *     this.name = name;
         *     this.age = age;
         * 
         * }
         * 
         * Entonces a nuestra variable se le debe pasar esos parametros que "dicta" el contructor
         * 
         * var persona = new Person("GiornoGiovana", 23);
         * 
         */
        // persona.name = "Giorno";
        // persona.age = 24;

        persona.sayHello();

        persona.name = "Dio Brando";

        System.out.println(persona.name);

        // Usar el "molde" de Person para reutilizar el objeto.
        // Creamos a la peronsa2 y llamamos al metodo sayHello(); de Person
        var persona2 = new Person("Jonathan Joestar", 35);
        persona2.sayHello();
    }
}
