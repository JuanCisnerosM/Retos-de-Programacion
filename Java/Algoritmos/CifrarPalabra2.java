public class CifrarPalabra2 {
    
    // * Atributos
    String palabra1;
    String palabra2;

    // * Constructor
    public CifrarPalabra2(String palabra1, String palabra2) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }

    // * Metodo
    public void miCifradoInvertido() {
        String palabraCifrada = "";
        for (int i = 0; i < palabra1.length() || i < palabra2.length(); i++) {
            if (i < palabra1.length()) {
                palabraCifrada += palabra1.charAt(i);
            }
            if (i < palabra2.length()) {
                palabraCifrada += palabra2.charAt(palabra2.length() - i - 1);
            }
        }
        System.out.println("La palabra cifrada (en CifrarPalabra2) es: " + palabraCifrada);
    }
}
