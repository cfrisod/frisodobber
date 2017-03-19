package nl.frisodobber.java8.lambda;

import java.util.Optional;

/**
 * Created by dobber on 7-3-17.
 */
public class Java8Optional {

    private String nullValue;
    private String notNull = "Not null";


    public static void main(String[] args) {
        Java8Optional java8Optional = new Java8Optional();
    }

    public Optional<String> getNotNull() {
        return Optional.ofNullable(notNull);
    }
}
