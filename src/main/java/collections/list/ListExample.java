package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        String s1 = "napis";
        String s2 = "napis2";

        String[] strings = new String[10];
        strings[0]=s1;
        strings[1]=s2;
        System.out.println(strings);

        List<String> stringList = new ArrayList<>();
        stringList.add(s1);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s2);
        stringList.add(s1);
        stringList.add(s1);
        stringList.add(s1);
        stringList.add(s1);

        System.out.println(stringList);
// usuwanie z indeksu 0 wartosci
        stringList.remove(0);
        System.out.println(stringList);

        for (String s:stringList){
            System.out.println(s);
        }

        System.out.println("Czy lista zawiera obiek: " + stringList.contains(s2));

        System.out.println("Czy lista jest pusta: "+ stringList.isEmpty());

        System.out.println("Liczba elementów: " + stringList.size());

        // usuwanie elementów z listy
        stringList.clear();

        System.out.println("Liczba elementów: " + stringList.size());

//      LINKED LIST - inny rodzaj listy :

        LinkedList<String> linkedList = new LinkedList<>(); // nie jest to tablica

        String s3 = "Nowy napus";
        // innne możliwości

        linkedList.addFirst(s1);
        linkedList.addLast(s2);;
        System.out.println("Pierwszy : " +linkedList.getFirst());
        System.out.println("Ostatni : " +linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();

    }


}
