package lambda.generic;

import java.util.function.Consumer;

public class Exercise {
    public static void main(String[] args) {
        String s = "Imie ";
        Integer i = 1;
        process(s, s1 -> System.out.println(s1));

        process(i, i1 -> System.out.println(i1));
        //zapis powyższy i ponizszy oznacza to samo
        process(i, System.out::println);
    }

    private static <E> void process(E element, Consumer<E> consumer){
        consumer.accept(element);
    }
}
