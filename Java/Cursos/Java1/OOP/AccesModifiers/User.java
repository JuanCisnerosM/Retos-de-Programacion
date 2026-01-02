package OOP.AccesModifiers;

public class User {
    
    // 6. Crea una clase User con los atributos privados username y password. 
    // Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

    // * Atributos
    private String username;
    private String password;

    // * Constructor

    // * Metodos
    public void checkPassword(String inputPassword) {
        if (password.equals(inputPassword)) {
            System.out.println("Las contraseñas coinciden");            
        } else {
            System.out.println("Las Contraseñas no coinciden");
        }
    }

    // * Metodo Set
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // * Metodo Get para mostrar los datos (y para que no muestre que la var username no se ocupa)
    public String getUsername() {
        return username;
    }
}
