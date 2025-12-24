package OOP;

public class Book2 {

    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    // * Atributos
    String title;
    String author;

    // 3. Añade un constructor a la clase Book que reciba title y author. // * para no romper el Ejercicio 1 creamos Book2 como copia de Book
    // * Constructor
    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }


    // * Metodo
    public void BookData2() {
        System.out.println("Titulo del libro: " + title + ", author: " + author);       
    }
}
