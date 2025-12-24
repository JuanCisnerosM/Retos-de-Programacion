package OOP;

public class Student {

    // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
    // * Atributos
    int score;

    // * Metodo
    public void aprove() {
        if (score >= 60) {
            System.out.println("Aprobo! :D ");
        } else {
            System.out.println("No Aprobo D: F");
        }
    }
    /**
     * * Metodo mas explicito mas mejor XD , calificacion de 0 a 100
     * 
     * public void aprove() {
     *     if (score >= 0 && score < 60) {
     *         System.out.println("No Aprobo D: F");
     *     } else if (score >= 60 && score <= 100) {
     *         System.out.println("Aprobo! :D ");
     *     } else {
     *         System.out.println("Calificacion invalida (fuera de rango 0-100)");
     *     }
     * }
     *   
    */
}
