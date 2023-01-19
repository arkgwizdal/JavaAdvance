package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExcercises {

    public static void main(String[] args) {

        //Chcemy przechowywać wszystkie oceny danego ucznia
        //jan
        String Jan = "Janek";
        int matematyka = 1;
        int biologia = 5 ;
        List<Integer> ocenyJan =  List.of(matematyka, biologia);

        // Basia
        String Basia = "Basia";
        int matematyka2 = 4;
        int biologia2 = 4 ;
        List<Integer> ocenyBasia =  List.of(matematyka2, biologia2);


        Map<String, List<Integer>> classroom =  new HashMap<>();

        classroom.put(Jan, ocenyJan);
        classroom.put(Basia, ocenyBasia);

        //Wyswietlamy uczniów wraz z oczenai
       var entrySet =  classroom.entrySet();

       for (Map.Entry<String, List<Integer>> record:entrySet){
           System.out.println("Uczeń : " + record.getKey()+" Oceny : "+record.getValue());
       }

       // Dodawanie oceny Janowi

     //   classroom.get("Jan").add(1);

       // Liczenie średniej z ocen

        System.out.println("To ma się równać (4)  = "+countAVGForStudnets(classroom).get("Basia"));


    }

    private static Map<String, Double> countAVGForStudnets(Map<String, List<Integer>> students){
        Map<String,Double> avgMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> record : students.entrySet()){
            Integer sum =0;
            for (Integer grade: record.getValue()){
                sum = sum + grade;
            }
            Double avg = sum.doubleValue() / record.getValue().size();

            avgMap.put(record.getKey(), avg);
        }

        return avgMap;

    }
}
