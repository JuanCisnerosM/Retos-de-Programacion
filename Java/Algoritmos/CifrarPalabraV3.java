public class CifrarPalabraV3 {
    
    // * Atributos
    String palabra1ACifrar;
    String palabra2ACifrar;

    // // * Constructor
    // public CifrarPalabraV3(String palabra1ACifrar, String palabra2ACifrar) {
    //     this.palabra1ACifrar = palabra1ACifrar;
    //     this.palabra2ACifrar = palabra2ACifrar;
    // }

    // * Metodo
    public static void cifrar3(String palabra1ACifrar, String palabra2ACifrar) {
        String cifrada3 = "";

        for (int i = 0; i < palabra1ACifrar.length() || i < palabra2ACifrar.length(); i++) {
            if (i < palabra1ACifrar.length()) {
                cifrada3 += palabra1ACifrar.charAt(i);
            }
            if (i < palabra2ACifrar.length()) {
                cifrada3 += palabra2ACifrar.charAt(palabra2ACifrar.length() - i - 1);
            }
        }
        
        System.out.println("La palabra cifrada (en CifrarPalabraV3) es: " + cifrada3);
    }
}
