package OOP.ClassesAndMethods;

public class Product {
    
    // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    // * Atributos
    double precio;
    double descuento;

    // * Constructor
    public Product(double precio, double descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }
    
    // * Metodo
    public void aplicarDescuento() {
        double precioConDescuento = precio - (precio * descuento / 100);
        // O en vez de esta variable poner directo precio * ((100 - descuento) / 100)
        // System.out.println("Valor original : $" + precio + " , Precio con " + descuento + "% de descuento : $" + (precio * ((100 - descuento) / 100)));
        System.out.println("Valor original : $" + precio + " , Precio con " + descuento + "% de descuento : $" + precioConDescuento);
    }
}
