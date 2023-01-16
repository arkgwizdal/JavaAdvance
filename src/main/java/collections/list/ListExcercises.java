package collections.list;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExcercises {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(9);
        numbers.add(6);
        numbers.add(3);
        numbers.add(12);
        System.out.println("Pierwotna Lista " +numbers);
        System.out.println("Lista parzystych luczb" +findEvenNumbers(numbers));

        Collections.reverse(numbers);
        System.out.println("Lista odwtorna "+ numbers);

    }
//    MOJE ROZWIĄZANIE
//    public static List<Integer> findEvenNumbers (List<Integer> numbers){
//        List<Integer> listOut = new ArrayList<>();
//
//
//        for( int i = 0;i<numbers.size(); i++){
//            if ((numbers.get(i) % 2)==0) {
//                listOut.add(numbers.get(i));
//            }
//        }
//
//        return listOut;
//    }

    // Rozwiąznie prowadzącego - Tomek
    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
        List<Integer> listOut = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0)
                listOut.add(number);
        }
        return listOut;
    }
}
