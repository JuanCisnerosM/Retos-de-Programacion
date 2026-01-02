package OOP.AccesModifiers;

public class Employee {
    
    // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

    // * Atributos
    private double salary;

    // * Constructor

    // * Metodos
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += ((percent / 100) * salary);
            System.out.println("El salario nuevo es: $" + salary);
        } else {
            System.out.println("El aumento no es positivo");
        }
    }
    
    // * Metodo Set
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
