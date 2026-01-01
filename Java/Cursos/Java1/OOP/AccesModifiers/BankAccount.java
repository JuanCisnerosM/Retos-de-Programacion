package OOP.AccesModifiers;

public class BankAccount {
    
    // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.

    // * Atributos
    private float balance;

    // * Contructor
    public BankAccount(float balance){
        this.balance = balance;
        System.out.println("El balance de Hoy es: $" + balance);
    }
    

    // * Metodos
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposito por: $" + amount);
            System.out.println("El balance es de: $" + balance);            
        } else {
            System.out.println("Cantidad de deposito no valida");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Retiro por: $" + amount);
            System.out.println("El balance es de: $" + balance);            
        } else {
            System.out.println("Cantidad de retiro no valida");
        }
    }
}
