package lambda.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Jarek", "Krzysztof", "Kamila");
        List<Integer> numbers = List.of(1,6,4,7,6,4,756,9);

        // imiona których liczba lister jest wieksza od 5
        System.out.println(process(names, s -> s.length()>8));
        System.out.println(add(names, d -> "Hello "+d));


        print(numbers, num -> System.out.println("tu jest liczba " + num));
        print(names, imie -> System.out.println("tu jest liczba " + imie));
    }

    //  Predictate
    // BiConsumer
    // Consumer
//    Comparator


//    private static void print(List<Integer> numbers, Consumer<Integer> consumer){
//        for (Integer num : numbers){
//            consumer.accept(num);
//        }
//    }

    private static <E> void print(List<E> numbers, Consumer<E> consumer){
        for (E num : numbers){
            consumer.accept(num);
        }
    }

    private static List<String> add(List<String> list, Process<String> process){
        var result = new ArrayList<String>();
        for (String element : list){
            result.add(process.aplly(element));
        }
        return result;
    }
    private static List<String> process(List<String> list, Process<Boolean> process){
        var result = new ArrayList<String>();
        for (String element : list){
            result.add(element);
        }
    return result;
    }

}
