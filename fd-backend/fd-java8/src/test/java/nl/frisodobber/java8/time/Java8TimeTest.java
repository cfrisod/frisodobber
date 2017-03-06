package nl.frisodobber.java8.time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by dobber on 6-1-17.
 */
class Java8TimeTest {
    @Test
    @DisplayName("This is my own custom name")
    void stringZuluToZonedDateTimeSystemDefaultTest(/*TestInfo testInfo*/) throws Exception {
//        System.err.println(testInfo);
        Assertions.assertNotNull(Java8Time.getLocalDateTimeAtZulu());
    }
}
