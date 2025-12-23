package Estructuras;
import java.util.ArrayList;
import java.util.Arrays; // ! importante para crear ArrayList con datos de la formaArrayList<TipoDeVariable> nombreDeVariable = new ArrayList<>(Arrays.asList("dato1", "dato2", "datoX"));
import java.util.HashMap;
import java.util.HashSet;
import java.util.List; // ! importante para crear ArrayList con datos de la forma var nombreDeVariable = new ArrayList<TipoDeVariable>(List.of("dato1", "dato2", "datoX"));


public class StructuresExercises {
    
    public static void main(String[] args) {
        
        /**
         * * Ejercicios sobre Array, ArrayList, HashSet y HashMap
         */
        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] names1 = { "Messi", "Cristiano", "Pele", "Maradorna", "Cruyff" };
        System.out.println("La longid es de: " + names1.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("El valor del indice 1 de names1 es de: " + names1[1]);
        names1[1] = "CR7";
        System.out.println("El valor del indice 1 de names1 es de: " + names1[1]);


        // 3. Crea un ArrayList vacío.
        ArrayList<String> names2 = new ArrayList<>();
        System.out.println("ArrayList names2 vacio: " + names2);

        // 3.1 Crear un ArrayList con 3 datos
        // ! importante importar  --  import java.util.Arrays;
        ArrayList<String> names3 = new ArrayList<>(Arrays.asList("ASAS", "ASASASD"));
        names3.add("HOLA");
        System.out.println("ArrayList names3 con datos: " + names3);

        // ! importante importar  --  import java.util.List;
        var names4 = new ArrayList<String>(List.of("dato1", "dato2"));
        names4.add("datoX");
        System.out.println("ArrayList names4 con datos: " + names4);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        names2.add("nuevovalor1");
        names2.add("nuevovalor2");
        names2.add("nuevovalor3");
        names2.add("nuevovalor4");
        names2.add("nuevovalor1"); // Valor repetido, lo vamos a borrar.
        System.out.println("ArrayList names2 contiene: " + names2);
        
        names2.remove(4);
        System.out.println("ArrayList names2 contiene: " + names2);
        

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> hashset1 = new HashSet<>(Arrays.asList("hashset1", "hashset2"));
        System.out.println(hashset1);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        hashset1.add("hashset2"); // Valor Repetido
        hashset1.add("hashset3");
        System.out.println(hashset1);

        // 7. Elimina uno de los elementos del HashSet.
        System.out.println("El hashset1 contiene el elemento hashset1?: " + hashset1.contains("hashset1"));
        hashset1.remove("hashset1");
        System.out.println("El hashset1 contiene el elemento hashset1?: " + hashset1.contains("hashset1"));

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> newHashMap1 = new HashMap<>();
        newHashMap1.put("John", "1234567");
        newHashMap1.put("Andy", "8989546");
        newHashMap1.put("Jorhe", "2123123");
        System.out.println(newHashMap1);

        // 9. Modifica uno de los contactos y elimina otro.
        newHashMap1.replace("John", "1234567", "9999999");
        newHashMap1.remove("Jorhe", "2123123");
        System.out.println(newHashMap1);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] names6 = { "Jotaro", "Giorno", "Dio", "Abdol" }; // * El Array
        /**
         * * Luego a una Lista Fija 
         * ! Este es un paso intermedio
         * Usar primero una lista fija no aporta valor funcional salvo para:
         * Depuración
         * Enseñanza
         * Casos muy controlados
         * 
         * * Los 2 Escenarios son: 
         * 
         * * 1)
         * * Directo a ArrayList (recomendado)
         * 
         * ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
         * 
         * ArrayList<String> names6NewArrayList = new ArrayList<>(Arrays.asList(names6));
         * 
         * * 2) 
         * * Primero lista fija, luego ArrayList
         * 
         * List<String> fixedList = Arrays.asList(array);
         * ArrayList<String> list = new ArrayList<>(fixedList);
         * 
         * List<String> names6NewArrayList = Arrays.asList(names6);
         * ArrayList<String> names6NewArrayList = new ArrayList<>(names6FizedSizeList);
         * 
         * Diferencia real en términos empresariales
         * Aspecto	            Directo a ArrayList	        Lista fija → ArrayList
         * Seguridad	                Alta	                    Media
         * Riesgo de error	            Bajo	                    Mayor
         * Legibilidad	                Alta                    	Media
         * Uso en producción	        Sí	                        Solo si sabes lo que haces
         * 
         * * Por lo que es mejor y recomendado hacerlo de forma directa, pero para este caso practo vamos a hacerlo de la forma larga, con una lista fija
         * 
         */
        List<String> names6FizedSizeList = Arrays.asList(names6); // Luego a una Lista
        // ArrayList<String> names = new ArrayList<>(lePasamosLaLista); 
        ArrayList<String> names6NewArrayList = new ArrayList<>(names6FizedSizeList); // aqui ya tenemos el ArrayList
        System.out.println("De Array a List y luego a ArrayList: " + names6NewArrayList);
        // HashSet(TipoDeVariable) nombreDeVariable = new HashSet(LePasamosElArray);
        HashSet<String> names6NewHashSet = new HashSet<>(names6NewArrayList);
        System.out.println("De Array a List y luego a ArrayList y luego a HashSet: " + names6NewHashSet);
        // HashMap<tipoDeVariable, tipoDeVariable> nombreDeVariable = new HashMap<>();
        HashMap<String, String> names6NewHashMap = new HashMap<>();
        /**
         * No existe conversión automática porque son estructuras con contratos distintos.
         * Si quieres los mismos valores como clave y valor, debes iterar y cargarlos manualmente. Esto es normal, correcto y esperado en Java.
         * 
         * * Uso de un for para hacer iteraciones
         * Donde el for recorre todos los elementos del HashSet y los copia al HashMap usando el mismo valor como clave y como valor.
         * 
         * Seria algo como  " Para cada valor de tipo String que exista dentro del HashSet…  guárdalo en el HashMap usando ese mismo valor como clave y también como valor
         * y en codigo seria: for  (String names6HashSetvalue : names6NewHashSet)            {names6NewHashMap.put(names6HashSetvalue, names6HashSetvalue);
        }
         */
        for (String names6HashSetvalue : names6NewHashSet) {
            names6NewHashMap.put(names6HashSetvalue, names6HashSetvalue);
        }
        System.out.println("De Array a List y luego a ArrayList y luego a HashSet y luego a HashMap: " + names6NewHashMap);

       
    }
}
