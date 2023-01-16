package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queu = new LinkedList<>();
        queu.add("Tomek");
        queu.add("Kamil");
        queu.offer("Tomek");
        queu.offer("Kamil");
        // metoda peek zawsze zwraca piewszy argument i to tyle. nie usuwa go kolejki
        System.out.println(queu.peek());

        // metoda pool wyciaga 1 element z kolejki oraz usuuwa go z kolejki
        System.out.println(queu.poll());
        System.out.println(queu.poll());
        System.out.println(queu.peek());


    }
}
