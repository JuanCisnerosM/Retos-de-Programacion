package OOP.ClassesAndMethods;

public class BankAccount {
    
    // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
    // * Atributos

    // Segun internet, el tipo de dato correcto para este tipo de problema seria BigDecimal
    float balance;

    // * Constructor
    public BankAccount(float balance) {
        this.balance = balance;
    }

    // * Metodo
    /**
     * Para que el metodo sume el saldo se le debe pasar un parametro del mismo tipo (float) newTransfer
     * @param description
     * @param newTransfer
     * 
     * El metodo suma la Transferencia y la agrega al balance (balance = balance + newTransfer)
     */
    public void deposit(String description, float newTransfer) {
        balance += newTransfer;
        
        System.out.println("Concepto: " + description + ". Deposito de: $" + newTransfer);
        // System.out.println("El balance de la cuenta es: $" + balance);
    }
}
