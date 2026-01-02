package OOP.AccesModifiers;

public class Car {

    // 10. Crea una clase Car con el atributo privado speed. 
    // Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

    // * Atributos
    private float speed;

    // * Constructor

    // * Metodos
    public void accelerate(int amount) {
        if (speed + amount <= 120) {
            speed += amount;
            System.out.println("velocidad alcanzada: " + speed + " KM/HR");
        } else {
            speed = 120;
            System.out.println("MAXIMO DE VELOCIDAD ALCANZADO");
            System.out.println("velocidad alcanzada: " + speed + " KM/HR");
        }
    }
    
    public void brake(int amount) {
        if (speed - amount >= 0) {
            speed -= amount;
            System.out.println("velocidad alcanzada: " + speed + " KM/HR");
        } else {
            speed = 0;
            System.out.println(("MINIMO ALCANZADO"));
            System.out.println("velocidad alcanzada: " + speed + " KM/HR");
        }
    }
}
