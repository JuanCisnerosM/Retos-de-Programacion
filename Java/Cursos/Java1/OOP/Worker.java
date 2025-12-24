package OOP;

public class Worker {
    
    // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
    // * Atributos
    String nombre;
    double salario;

    // * Constructor
    public Worker(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    // * Metodo
    public void mostrarSalario() {
        System.out.println("Es salario de " + nombre + " es de: $" + salario);
    }
}
