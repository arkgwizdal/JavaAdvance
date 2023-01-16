package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    private static Map<String, String> dictionary = getDictionary();

    private static Map<String, String>getDictionary() {
        Map<String,String> pairs = new HashMap<>();
        pairs.put("mama", "mother");
        pairs.put("kot", "cat");
        pairs.put("pies", "dog");
        pairs.put("pociąg", "train");
        return pairs;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo po polsku aby prztłumacyzć");
        String polishWord = scan.next();

        if(dictionary.containsKey(polishWord)){
            System.out.println(dictionary.get(polishWord));

        } else System.out.println("Słowo nie wystepuje w słowniku ");

    }
}
