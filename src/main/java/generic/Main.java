package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {

    public static void main(String[] args) {
        SDAList<String> list = new SDAList<>();
        List<String> listFromElements = new SDAList<>("Tomek", "Maria", "Tadeusz");
        List<String> listOf = SDAList.of("Tomek", "Maria", "Tadeusz");

        System.out.println(listOf.size());

        list.add("Juzef");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Damian");
        arrayList.add("Karolina");

        System.out.println(list.get(0));

        System.out.println(list.union(listOf));


    }
}
