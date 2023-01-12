package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        String s1 = "napis";
        String s2 = "napis2";

// Set nie pozwala na duplikaty, przyjmuje jedynie indywidualne elementy i posortuje. po hashu ( co by to nie znaczył)
        Set<String> stings =  new HashSet<>();

        stings.add(s1);
        stings.add(s2);
        stings.add(s1);
        System.out.println(stings);
    }
}
