package OOP.AccesModifiers;

public class Product {
    
    // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
    
    // * Atributos
    private double price;

    // * Constructor (por defecto)
    public Product() {

    }
    
    // * Metodo Principal
    public void miProducto() {
        System.out.println("Mi producto tiene el precio de: $" + price);
    }
    
    // * Metodo auxiliar del tipo Set
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Precio no valido");
        }
    }
    


}
