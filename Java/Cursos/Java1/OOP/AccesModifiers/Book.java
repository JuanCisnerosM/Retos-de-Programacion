package OOP.AccesModifiers;

public class Book {
    
    // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). 
    // El título debe asignarse solo por el constructor.

    // * Atributos
    private String title;

    // * Constructor
    public Book(String tittle) {
        this.title = tittle;
    }

    public String getTitle() {
        return title;
    }
}
