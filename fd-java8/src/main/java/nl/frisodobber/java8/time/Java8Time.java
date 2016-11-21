package nl.frisodobber.java8.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by dobber on 12-10-16.
 */
public class Java8Time {

    public static void main(String[] args) {
        String source = "2016-10-12T23:10:10Z";

        System.out.println(stringZuluToZonedDateTimeSystemDefault(source));
        System.out.println(stringZuluToZonedDateTimeSystemDefault(source).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println(stringZuluToLocalDateTimeSystemDefault(source));
        System.out.println(stringZuluToLocalDateTimeSystemDefault(source).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        System.out.println(stringZuluToZonedDateTimeZulu(source));

        System.out.println(getLocalDateTimeAtZulu());

        System.out.println(getZonedDateTimeAtSystemDefault());

    }

    public static ZonedDateTime stringZuluToZonedDateTimeSystemDefault(String zulu) {
        Instant ldt = Instant.parse(zulu);
        return ldt.atZone(ZoneId.systemDefault());
    }

    public static LocalDateTime stringZuluToLocalDateTimeSystemDefault(String zulu) {
        Instant ldt = Instant.parse(zulu);
        return LocalDateTime.ofInstant(ldt, ZoneId.systemDefault());
    }

    public static ZonedDateTime stringZuluToZonedDateTimeZulu(String zulu) {
        return ZonedDateTime.parse(zulu);
    }

    public static LocalDateTime getLocalDateTimeAtZulu() {
        return LocalDateTime.now(ZoneId.of("UTC"));
    }

    public static ZonedDateTime getZonedDateTimeAtSystemDefault() {
        return ZonedDateTime.now();
    }
}
