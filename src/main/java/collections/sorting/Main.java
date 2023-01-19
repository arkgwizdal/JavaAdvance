package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
//-------------    SORTOWANIE za pomocą COLECTIONS  --------------------------------------------------
        List<Integer> integers = new ArrayList<>(List.of(1,4,5,7,8,4356,8,9,87));

        System.out.println("Lista bez sortu  : "+ integers);
        //sortowanie
        Collections.sort(integers);
        System.out.println("Lista posortowana" + integers);
        // odwracanie
        Collections.reverse(integers);
        System.out.println("Lista odwrócona "+integers);

//-------------    SORTOWANIE za pomocą COMPARATOR  --------------------------------------------------

        Integer num = 5;
        Integer num2 = 5;
        Integer bigger = 10;

        System.out.println("Mniejsza porówana do większej "+ num.compareTo(bigger)); // -1
        System.out.println("większa porówanan do mniejsze "+ bigger.compareTo(num)); // 1
        System.out.println("liczby są równe  "+ num2.compareTo(num)); // 0


        List<Integer> listForComparing = new ArrayList<>(List.of(1,4,5,7,8,4356,8,9,87));

        System.out.println("Lista bez sortu: " + listForComparing);

        // SOROTOWANIE ROSNĄCE PRZYKĄŁDY KOLEJNE  TO SAMO ZNACZENIE
//        listForComparing.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println("Lista posortowana" + listForComparing);

//         listForComparing.sort((o1, o2) -> o1.compareTo(o2));   <- ZApis z samą lambdą
       listForComparing.sort(Integer::compareTo);   // ZAPIS Z COMPARATOREM
        System.out.println("Lista posortowana" + listForComparing);


//   ZAPIS SORTOWANIA MALEJOĄCO KOLEJNO OD KLASY ABST PRZEZ LAMBDA I DO LAMBDA COMPARATOR
//        listForComparing.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });

//        listForComparing.sort((o1, o2) -> o2.compareTo(o1)); // <- ten zapis można zapisać równiez za pomocą komparatora
        listForComparing.sort(Comparator.reverseOrder());
        System.out.println("Lista posortowana malejąco" + listForComparing);

//   --------- SORTOWANIE STRINGÓW
        List<String> stringList = new ArrayList<>(List.of("Karol", "Adam", "Zygmunt", "Celina"));
        System.out.println("Nieposortowana lista: " + stringList);
        stringList.sort(String::compareTo);
        System.out.println("Posortowana lista: " + stringList);

//  ---------- Porównywanie obiektów po polach w klasach

        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Kaczmarek");
        Person jadwiga = new Person("Jadwiga", "Skudro");

        List<Person> people = new ArrayList<>(List.of(jan, karolina, jadwiga));
        System.out.println("Niepososrtowana lista osób" + people);

        people.sort((o1, o2) -> o1.getName().compareTo(o2.getSurname()));
        System.out.println("Posortowana lista po imionach "+ people);

  //      people.sort((o1, o2) -> (o1.getName())
    }
}
