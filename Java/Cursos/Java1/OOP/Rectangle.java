package OOP;

public class Rectangle {
    
    // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    // * Atributos
    int base; // Length, Largo, Base 
    int altura; // Width, Ancho, Altura

    // * Constructor
    public Rectangle(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // * Metodo
    public void area() {
        int area = base * altura;
        System.out.println("EL area del rectangulo es de: " + area + " unidades");
    }

    public void perimetro() {
        int perimetro = 2 * (base + altura);
        System.out.println("El perimetro del rectangulo es de: " + perimetro + " unidades");
    }
}
