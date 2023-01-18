package lambda.excercise;

import com.sun.java.accessibility.util.EventQueueMonitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,5,7,2,3,78,41,1,6,10);
        System.out.println("Pierwotna lista liczb: " + numbers);

        EventInterface isEvnen = new EventInterface() {
            @Override
            public boolean warunek(Integer num) {
                return (num % 2) == 0;
            }
        };

        System.out.println("Tylko liczby parzyste " + process(numbers, isEvnen));

        System.out.println("Tylko liczby większe od 10 " + process(numbers,(d)-> d > 10 ));

        EventInterface oddNumbers = new EventInterface() {
            @Override
            public boolean warunek(Integer num) {
                return (num % 2) != 0;
            }
        };

        System.out.println("Tylko liczby nieparyste:  " + process(numbers, oddNumbers));
    }

    private static List<Integer> process(List<Integer> numbers, EventInterface eventInterface ){
        var resoult = new ArrayList<Integer>();
        for (Integer d:numbers){
            if(eventInterface.warunek(d))
                resoult.add(d);
        }
        return resoult;

    }
}
