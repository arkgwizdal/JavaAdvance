package collections.set;

import org.w3c.dom.DOMStringList;

import java.util.*;

public class SetExcercises {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Tomek");
        stringList.add("Janina");
        stringList.add("Janina");
        stringList.add("Barbara");
        stringList.add("Barbara");
        stringList.add("Kamil");
        stringList.add("kamil");

        removeDuplicates(stringList);

        System.out.println(stringList);


    }

    private static void removeDuplicates(List<String> list){
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }


}
