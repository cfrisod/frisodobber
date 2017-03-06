package nl.frisodobber.java8.pecs;

/**
 * Created by dobber on 16-1-17.
 */
public interface Car {
    default String getName() {
        return getClass().getSimpleName();
    }

    int getMaxSpeed();
}
