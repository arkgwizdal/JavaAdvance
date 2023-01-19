package optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise {
    public static void main(String[] args) {
        String[] tab = new String[]{"Tomek", null, "Jan", null, "Maria", "Julia", "Robert"};
        List<String> stringList = new ArrayList<>(Arrays.asList(tab));

        Integer[] integers = new Integer[]{234,null, 123,132,425,null, 12312};
        List<Integer> integersList = new ArrayList<>(Arrays.asList(integers));

        System.out.println("integersList.forEach(s -> findNull(s))  : ");
        integersList.forEach(s -> findNull(s));

        System.out.println(" integersList.forEach(s -> check(s)) :  ");
        integersList.forEach(s -> check(s));


        stringList.forEach(s -> findNull(s));
        stringList.forEach(s -> check(s));
    }

    private static <T> void findNull(T s) {
        var optional = Optional.ofNullable(s);
        if (optional.isEmpty()){
            System.out.println("Znalazłem null ");
        }
    }

    private static <T>void check (T s){
        var optional = Optional.ofNullable(s);
        if (optional.isPresent()){
            System.out.println("Znalazłem wartość");
        }
    }
}
