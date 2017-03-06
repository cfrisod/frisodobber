package nl.frisodobber.java8.lambda;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by dobber on 3-12-16.
 */
public class Java8Lambda {
    /**
     * SupplierConsumer
     */
    Supplier<StringBuilder> s1 = StringBuilder::new;

    /**
     * SupplierConsumer, Predicate, Function and BiFunction
     */


    public static void main(String... args) {

        System.out.println(padRight("bla1234567890123", 35).length());
        List<LocalDateTime> localDateTimeList = Arrays.asList(LocalDateTime.now(), LocalDateTime.now().minusDays(1));
        localDateTimeList.sort(Comparator.naturalOrder());
        System.out.println(localDateTimeList);
    }

    private static String padRight(String s, int n) {
        String format = "%1$-" + n + "s";
        return String.format(format, s);
    }
}
