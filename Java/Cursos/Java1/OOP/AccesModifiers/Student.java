package OOP.AccesModifiers;

public class Student {
    
    // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

    // * Atributos
    private int grade;

    // * Contructor

    // * Metodo
    public boolean isPassed() {
        if (grade >= 60) {
            return true;            
        } else {
            return false;
        }
    }
    
    // * Metodo Set
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
