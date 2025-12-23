package Funciones;
import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    /**
     * Una funcion o metodo es un bloque de código reutilizable dentro de una clase que realiza una tarea específica,
     * acepta parámetros de entrada y puede devolver un valor, ayudando a organizar el código en partes lógicas 
     * y reducir la repetición para mejorar la eficiencia y legibilidad.
     * 
     * Se definen con un tipo de retorno (o void), un nombre y parámetros, y se llaman usando su nombre seguido de argumentos,
     * devolviendo un resultado con return si aplica. 
     */
    // * Funcion sin parametros ni retorno
    public static void miFuncion() {
        System.out.println("Enviar mensaje");
    }

    // * Funcion con parametros, el parametro debe ir en los parentesis, en este caso, parametro de tipo String llamado "email".
    public static void enviarEmailAlUsuario(String email) {
        System.out.println("Se envio un email al usuario: " + email);
    }
    

    // * Sobrecarga de funciones (Reutilizar la misma fucnion pero con parametros diferentes)
    public static void enviarEmailAlUsuario(String email, String name) {
        System.out.println("Enviar un correo al usuario " + name + " con correo: " + email);
    }

    public static void enviarEmailAlUsuario(ArrayList<String> emails) {
        for (String myEmails : emails) {
            System.out.println("Se envia el email a " + myEmails);
        }
    }
    
    // * Funciones con retorno sin parametros
    public static boolean enviarEmailConEstado() {
        System.out.println("Se ha envio el email!");

        return true;
    }

    // * Funcion con retorno con parametros
    public static boolean enviarEmailConEstado2(String email) {
        System.out.println("Se ha envio el email! a " + email);

        return true;
    }
    
    public static boolean enviarEmailConEstado3(String email) {
        if (email.isEmpty()) {
            return false;
        }
        System.out.println("Se envio el email3 a " + email);
        return true;
    }

    // * Reaprovechar la logica 
        
    /**
     * Ya tenemos una fucnion para enviar correos:
     * 
     * public static void enviarEmailAlUsuario(String email) {
     *     System.out.println("Se envio un email al usuario: " + email);
     * }
     * 
     * Y tenemos otra para envier multiples correos a un arreglo de correos:
     * 
     * public static void enviarEmailAlUsuario(ArrayList<String> emails) {
     *     for (String myEmails : emails) {
     *         System.out.println("Se envia el email a " + myEmails);
     *     }
     * }
     * 
     * * Reaprovechar la primera funcion en la segunda y tener algo asi:
     * public static void enviarEmailAlUsuario(ArrayList<String> emails) {
     *     for (String myEmails : emails) {
     *         enviarEmailAlUsuario(emails); // * volviendo a llamar la funcion 1 para imprimir el for
     *     }
     * }
     * 
     * 
     */
    // * Ejemplo de como Reaprovechar, notese que la funcion es la misma solo se cambio el nombre para "inferir" mas el ejemplo
    public static void enviarEmailAlUsuarioReaprovechar(String email) {
        System.out.println("Se envio un email al usuario: " + email + " reaprovechando la funcion");
    }

    public static void enviarEmailAlUsuarioReaprovechar(ArrayList<String> emails) {
        for (String myEmails : emails) {
            enviarEmailAlUsuarioReaprovechar(myEmails);
        }
    }
    
    public static void main(String[] args) {

        // * Funcion sin parametros
        for (int i = 0; i < 5; i++) {
            miFuncion();
        }

        // * Funcion con parametro
        enviarEmailAlUsuario("papoi@gmail.com");

        // * Funcion con varios parametros pero con el mismo nombre de la funcion (sobrecarga)
        /**
         * Al momento de llamar a una sobrecarga de funciones
         * te van a salir el nombre de la funcion 2 veces : enviarEmailAlUsuario();
         * 
         * Pero lo que recibre (parametros) va a cambiar, y tendras por un lado la funcion con 1 parametro:
         * enviarEmailAlUsuario(String email);
         * 
         * y por otro lado la funcion con 2 paramtros o mas
         * enviarEmailAlUsuario(String email, String name);
         * 
         * de forma que te si tienes las sugerencias de codigo activas apareceran las 2 de esa forma:
         * enviarEmailAlUsuario(String email);
         * enviarEmailAlUsuario(String email, String name);
         */
        enviarEmailAlUsuario("papoi@correo.com", "Bob");

        ArrayList<String> users = new ArrayList<>(Arrays.asList("tortuga@gmail.com", "dado@gmail.com"));
        enviarEmailAlUsuario(users);

        // * Funciones con retorno sin parametro
        enviarEmailConEstado();

        // Revisar el estado de la funcion con retorno (nos retorna alguna infomacion)
        var state = enviarEmailConEstado();
        System.out.println(state);

        // * Funcion con retorno con parametros
        enviarEmailConEstado2("muse@gmail.com");
        // Revisar el estado de la funcion con retorno (nos retorna alguna infomacion)
        var state2 = enviarEmailConEstado2("muse2@gmail.com");
        System.out.println(state2);

        // Revisar la funcion y el estado desde el mismo print
        System.out.println(enviarEmailConEstado3("")); // False porque la cadena esta vacia (isEmpty)
        System.out.println(enviarEmailConEstado3("hola@gmail.com")); // True porque la cadena no esta vacia (email = hola@gmail.com), imprime el el mensaje e imprime true

        // * Ejemplo de Reaprovehar la logica
        ArrayList<String> usersReaprovechar = new ArrayList<>(Arrays.asList("tortugareaprovechar@gmail.com", "dadoreaprovechar@gmail.com"));
        enviarEmailAlUsuarioReaprovechar(usersReaprovechar);
    }
}
