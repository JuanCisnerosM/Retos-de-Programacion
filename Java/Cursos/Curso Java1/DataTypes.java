public class DataTypes {

    public static void main(String[] args) {

        // * Tipos de Datos primitivos
        
        int myInt = 24;
        System.out.println(myInt);

        double myDouble = 1.74;
        System.out.println(myDouble);

        // Otros tipos de datos numericos
        // float, long, byte

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        // ! El String no es un tipo de dato primitivo, es una clase, pero la "cadena de texto" se usa mucho. Y en otros tpos de lenguaje es un dato primitivo
        String myString = "asdasd";
        System.out.println(myString);


        // * Tipo de datos en tiempo de compilacion
        // Los tipos de datos tienen su euivalente en clase (Tipo de dato primitivo: boolean ,clase: Boolean)

        // Si tenemos dudas en el tipo de dato en una clase en compilacion, a modo practico y de comprobacion rapida se usa el ".getClass().getSimpleName()" 
        System.out.println(myString.getClass().getSimpleName());
    }
}
