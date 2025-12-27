public class CifrarPalabra2 {
    
    // * Atributos
    String palabraUno;
    String palabraDos;

    // * Constructor
    public CifrarPalabra2(String palabraUno, String palabraDos) {
        this.palabraUno = palabraUno;
        this.palabraDos = palabraDos;
    }

    // * Metodo
    public void miCifradoInvertido() {
        String palabraCifrada = "";
        for (int i = 0; i < palabraUno.length() || i < palabraDos.length(); i++) {
            if (i < palabraUno.length()) {
                palabraCifrada += palabraUno.charAt(i);
            }
            if (i < palabraDos.length()) {
                palabraCifrada += palabraDos.charAt(palabraDos.length() - i - 1);
            }
        }
        System.out.println("La palabra cifrada (en CifrarPalabra2) es: " + palabraCifrada);
    }
}
