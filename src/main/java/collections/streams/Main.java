package collections.streams;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {

//  -------------------------- FILTER ----------------------------------------------
        List<Integer> integers = List.of(890, 345, 33, 5, 53, 6, 2, 1, 345);
        System.out.println("Pierwotna lista " + integers);


        List<Integer> onlyEvenLoop = new ArrayList<>();
        for (Integer i : integers) {
            if ((i % 2) == 0)
                onlyEvenLoop.add(i);
        }
        System.out.println("Tylko parzyste lista " + onlyEvenLoop);

        var integerStream = integers.stream();

        var onlyEvenStream = integerStream.filter(integer -> integer % 2 == 0).toList();
        System.out.println("Tylko parzyste stream " + onlyEvenStream);

//  -------------------------- MAP ----------------------------------------------
        List<Integer> integersToMap = List.of(890, 345, 33, 5, 53, 6, 2, 1, 345);

        // Lista stringów za pomocą metody converter
        var strings = converter(integers);

        //lista stringów za pomocą stream
        var stringsFromeStream = integersToMap.stream().map(integer -> String.valueOf(integer)).toList();




//  -------------------------- FLAT MAP ----------------------------------------------
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Szwata");
        Person rozalia = new Person("Rozalia", "Kobylska");
        Person maciej = new Person("Maciej", "Puszkowski");
        Person tomasz = new Person("Tomasz", "Wojtyra");

        var java = new Traning("Java", List.of(jan, karolina));
        var phyton = new Traning("PHYTON", List.of(rozalia,maciej, tomasz));

        var trinings = List.of(java, phyton);


        // wyciągamy wszystkie imiona osób na szkoleniach

        var names =  trinings.stream().flatMap(traning -> traning.getStudents().stream())
                .map(person -> person.getName()).toList();

        System.out.println(names);


    }

    private static List<String> converter(List<Integer> integers){
        var result = new ArrayList<String >();
        for (Integer i : integers){
            result.add(i.toString());
        }
        return result;
    }

}
