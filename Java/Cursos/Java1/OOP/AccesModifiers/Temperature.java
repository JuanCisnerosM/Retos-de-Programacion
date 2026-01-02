package OOP.AccesModifiers;

public class Temperature {

    // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

    // * Atributos
    private double celsius;

    // * Constructor
    public Temperature() {

    }

    // * Metodo Principal
    public void mostrarTemperatura() {
        System.out.println("La temperatura es : " + celsius + " grados celsius");
    }

    // * Metodo Set
    public void setCelsius(double celsius) {
        if (celsius >= -100 || celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("Temperatura no valida");
        }
    }

    // public double getCelsius() {
    //     return celsius;
    // }

    // Con un getter seria algo asi
    // System.out.println("La temperatura es: " + miTemperature.getCelsius() + " grados celsius");
}
