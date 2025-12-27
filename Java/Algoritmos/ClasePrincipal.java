public class ClasePrincipal {

    // * Metodo principal
    public static void main(String[] args) {

        // * CifrarPalabra2
        var miPalabraParaCifrar = new CifrarPalabra2("Garrafon", "Algebra");
        miPalabraParaCifrar.miCifradoInvertido();

        var palabraACifrar2 = new CifrarPalabra2("POPEYE", "camaron");
        palabraACifrar2.miCifradoInvertido();

        // * CifrarPalabrav3
        CifrarPalabraV3.cifrar3("HOKA","balvin");
    }
}
