package lambda.generic;

@FunctionalInterface
public interface Process<T> {

    T aplly(String s);

}
