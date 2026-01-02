package OOP.AccesModifiers;

public class Rectangle {

    // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

    // * Atributos
    private double width;
    private double height;

    // * Metodo
    public void calculateArea() {
        if (width > 0 && height > 0) {
            var area = width * height;
            System.out.println("El area del rectangulo es de: " + area + " unidades");            
        } else {
            System.out.println("No se puede calcular el area con numeros negativos");
        }
    }
   
    // * Metodo Set
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }    
}
