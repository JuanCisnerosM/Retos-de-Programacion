package OOP.ClassesAndMethods;

import java.util.ArrayList;

public class ClassesOPPExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var nuevoLibro = new Book();
        nuevoLibro.title = "Lord Of The Rings: The Two Towers";
        nuevoLibro.author = "J.R.R. Tolkien";

        nuevoLibro.BookData();

        /**
         * Dos formas de mostrar los datos del libro:
         * 
         * 1. Sin método (directamente):
         * System.out.println("Titulo del libro: " + nuevoLibro.title + ", author: " +
         * nuevoLibro.author);
         * 
         * 2. Con método (mejor opción):
         * nuevoLibro.BookData();
         * 
         * La opción 2 es mejor porque:
         * - Es más organizado
         * - Reutilizable (si creas varios libros, puedes llamar BookData() en cada uno)
         * - Sigue principios de POO (encapsulación)
        */

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var bolillo = new Dog();

        bolillo.Bark();

        // 3. Añade un constructor a la clase Book que reciba title y author. // * para no romper el Ejercicio 1 creamos Book2 como copia de Book 
        var nuevoLibro2 = new Book2("Lord Of The Rings: The Return of the King", "J.R.R. Tolkien");
        
        nuevoLibro2.BookData2();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var nuevoCarro = new Car();
        nuevoCarro.brand = "Toyota";
        nuevoCarro.model = 2001;

        nuevoCarro.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var calificacion = new Student();
        var calificacion2 = new Student();
        
        calificacion.score = 61;
        calificacion2.score = 59;
        
        calificacion.aprove();
        calificacion2.aprove();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        // * Aunque no lo pide el ejercicio agregamos un metodo constructor, para poner el balance en 0
        /**
         * En caso de no agregar el contructor seria asi:
         * 
         * var cuentaBanorte = new BankAccount();
         * cuentaBanorte.balance = 0;
         */
        var cuentaBanorte = new BankAccount(0);
        System.out.println("El balance actual es de: $" + cuentaBanorte.balance);

        cuentaBanorte.deposit("Para que se compre algo bonito <3", 5);
        cuentaBanorte.deposit("Comida", 250);

        System.out.println("El balance actual es de: $" + cuentaBanorte.balance);
        
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var miRectangulo = new Rectangle(5, 2);
        miRectangulo.area();
        miRectangulo.perimetro();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var nuevoTrabajador = new Worker("Dio Brando", 10000);
        nuevoTrabajador.mostrarSalario();

        Worker nuevoTrabajador2 = new Worker("JoJo", 10000);
        nuevoTrabajador2.mostrarSalario();

        // 8.1 Lo mismo pero con un ArrayList de empleados y que la llamada sea Worker.mostrarSalario("Dio Brando");
        new Worker2("Inoske", 2100);
        new Worker2("Jojo Rabbit", 1500);
        new Worker2("Leo Messi", 2000000);

        Worker2.mostrarSalario2("Leo Messi");
        Worker2.mostrarSalario2("Dio");
        Worker2.mostrarSalario2("Inoske");
        Worker2.mostrarSalario2("Jojo Rabbit");

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> personas = new ArrayList<Person>();
        
        var persona1 = new Person("Giorno", 55);
        Person persona2 = new Person("JOJO", 21);
        var persona3 = new Person("Papoi", 99);

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        for (Person laPersona : personas) {
            laPersona.sayHello();
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var laptop = new Product(10000, 60);

        laptop.aplicarDescuento();
    }
}
