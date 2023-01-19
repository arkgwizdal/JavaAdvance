package collections.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;

class Exercises {
    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Szwata");
        Person rozalia = new Person("Rozalia", "Kobylska");
        Person maciej = new Person("Maciej", "Puszkowski");
        Person tomasz = new Person("Tomasz", "Wojtyra");

        List<Person> people = List.of(jan, rozalia, karolina, tomasz,maciej);

        // Stwórz nowa liste Imion w której nie będzie osób z nazwiskiem na literę K, zwracane jest jedynie IMIE

       var withoutKSurname = people.stream().filter(person -> !person.getSurname().startsWith("K"))
               .map(person -> person.getName()).toList();
        System.out.println(withoutKSurname);


        //Jan
        String jan1 = "Jan";
        Integer matemematyka1 = 1;
        Integer biologia1 = 5;
        List<Integer> ocenyJan = List.of(matemematyka1, biologia1);
        //Basia
        String basia = "Basia";
        Integer matemematyka2 = 4;
        Integer biologia2 = 4;

        //klasa
        List<Integer> ocenyBasia = List.of(matemematyka2, biologia2);
        Map<String, List<Integer>> classroom = new HashMap<>();
        classroom.put(jan1, ocenyJan);
        classroom.put(basia, ocenyBasia);

        //  wyświetlanie klucza i wartości za pomoacą lambdy
        classroom.forEach((k,v) -> System.out.println(k+v));

        var result = classroom.entrySet()
                .stream().filter(stringListEntry -> stringListEntry.getKey().equals("Basia")).toList();

        System.out.println(result);

    }
}
