// Juan Cisneros
// cifrar 2 palabras en una, 1ra letra de la palabra 1 , ultima letra de la palabra 2

public class cifrarpalabra {

    public static String palabracifrar(String palabra, String cifrar) {
        StringBuilder newsb = new StringBuilder();

        for (int i = 0; i < palabra.length() || i < cifrar.length(); i++) {
            if (i < palabra.length()) {
                newsb.append(palabra.charAt(i)); // primera letra de "palabra"
            }
            if (i < cifrar.length()) {
                newsb.append(cifrar.charAt(cifrar.length() - i - 1)); // ultima letra de "cifrar" 
            }

        }
        return newsb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(palabracifrar("Garrafon","Algebra"));  // salida esperada : GaarrbreagfloAn
    }
}

