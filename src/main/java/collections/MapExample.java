package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        String student1 = "Jan";
        String student2 = "Kasia";
        int ocena1 = 4;
        int ocena2 = 5;

        Map<String, Integer> klasa = new HashMap<>();
// Hashmapa nie pozwoli na duplikaty w kluczu

        klasa.put(student1, ocena1);
        klasa.put(student2, ocena2);
        klasa.put(student2, ocena2); // nie da się dwa razu utrozyc tego samego ucznia /obiektu


        System.out.println(klasa);

        System.out.println("klucze : " + klasa.keySet());
        System.out.println("wartości : "+ klasa.values());

    }
}
