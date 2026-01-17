package OOP.Inheritance;

public class Inheritance {
    
    public static void main(String[] args) {

        // * Herencia
        /**
         * La herencia en Java es un pilar de la Programación Orientada a Objetos (POO) 
         * que permite a una clase (hija o subclase) heredar atributos y métodos de otra clase (padre o superclase), 
         * promoviendo la reutilización de código y la creación de jerarquías lógicas (relaciones "es un"). 
         * Se implementa con la palabra clave extends, creando una relación padre-hijo donde la hija puede usar, 
         * modificar o extender las funcionalidades de la padre, estructurando el código de forma más clara y mantenible. 
         */
        var animal = new Animal("Gargantua");
        animal.eat();

        // * Una vez heredadas las propiedades de Animal a Dog podemos:
        var dog = new Dog("Mimosa", 11);
        dog.eat();

        // * Una vez heredadas las propiedades de Animal a Cat podemos:
        var cat = new Cat("Meaowl");
        cat.eat();

        var bird = new Bird("Papaloma");
        bird.eat();
        bird.fly();
    }

    // Clase 1
    public static class Animal {

        // * Atributos
        String name;

        // * Constructor
        public Animal(String name) {
            this.name = name;
        }

        // * Metodos
        public void eat() {
            System.out.println("El animal con nombre " + name + " esta comiendo");
        }
    }
    
    // ! en CLase 2 y 3. Estamos reutilizando metodos y codigo que en este caso son iguales osea copiando y pegando

    /**
     * // Clase 2
     * public static class Dog {
     * 
     *   // Atributos
     *   String name;

     *   public void eat() {
     *       System.out.println("El animal con nombre " + name + " esta comiendo");
     *   }
     * 
     * }
    
     * // Clase 3
     * public static class Cat {
     * 
     *   // Atributos
     *   String name;
     * 
     *   public void eat() {
     *       System.out.println("El animal con nombre " + name + " esta comiendo");
     *   }
     *   
     * }
     * 
     */

    // * La Herencia nos permite que un subclase "hija" herede de una superclase "padre", y que este proceso de herencia herede sus atributos y metodos del padre
    /**
     * Para este caso se busca que la clase Animal (superclase) herede sus metodos a sus hijos en este caso a las clases Dog y Cat
     * Ya que estan haciendo uso de el mismo metodo eat();
     * 
     * * La palabra magica 'extends'
     */

    // Clase 2
    public static class Dog extends Animal {

        /**
         * Recordemos que la clase Animal tiene como Atributos String name;
         * y como metodo eat();
         * 
         * Y ya con esto el extends, en el metodo main ya podemos hacer uso de name y eat() sin necesidad de meter codigo de mas en la clase Dog
         * 
         */
        // * Atributos
        int age;

        // * El super hace referencia a la superclase (al atributo name del contructor de la super clase)
        // Si quiero agregar mas atributos al contructor del perro pues lo especializamos, osea agregar mas atributos en este caso age;
        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        // * uso de 'super' para especializar la clase
        /**
         * ejemplo de espeicalizar el metodo eat() para que ahora diga que el perro esta comiendo y no solo el animal esta comiendo
         * public void eat() {
         *     System.out.println("El perro con nombre " + name + " esta comiendo");
         *  }
         *
         */
        // * El super hace referencia a la superclase (al metodo eat de la super clase), por lo que la comento porque se sobreescribe el metodo.
        @Override
        public void eat() {
            // super.eat();
            System.out.println("El perro con nombre " + name + " esta comiendo");
        }
    }
    
    // Clase 3
    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        /**
         * Igual que arriba
         * Recordemos que la clase Animal tiene como Atributos String name;
         * y como metodo eat();
         * 
         * Y ya con el extends, en el metodo main ya podemos hacer uso de name y eat() sin necesidad de meter codigo de mas en la clase Cat
         * 
         */
        @Override
        public void eat() {
            // super.eat();
            System.out.println("El gato con nombre " + name + " esta comiendo");
        }

    }
    
    // Clase 4
    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
            
        }
        @Override
        public void eat() {
            // super.eat();
            System.out.println("El pajaro con nombre " + name + " esta comiendo");
        }
        // * Metodo exlcusivo del pajaro
        public void fly() {
            System.out.println("Esta volando");
        }
    }
}
