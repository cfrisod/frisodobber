package nl.frisodobber.java8.pecs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dobber on 16-1-17.
 */
public class Pecs {
    public static void main(String... args) {
        new Pecs().run();
    }

    public void run() {
        Ferrari myFerrari = new Ferrari();
        Porche myPorche = new Porche();

        Map<String, Car> cars = new HashMap<>();
        cars.put("ferrari", myFerrari);
        cars.put("porche", myPorche);

        Map<String, ? extends Car> producer = cars;
        Map<String, ? super Car> consumer = cars;

        /** Producer extends **/
        //We can't put any subelements in this Map because the compiler doesn't know what kind
        //of subtypes are in it.
        //producer.put("ferrari", myFerrari); //Compile error!
        //The result is guaranteed to be of kind Car
        producer.entrySet().stream().forEach(e -> System.out.println(e.getValue().getName()));

        /** Consumer super **/
        consumer.put("otherObject", new Porche());
        consumer.put("otherObject", new Ferrari());
        //Here we don't know what the supertype is. It can be all different kinds of Cars.
        //So you can only get Objects out of it.
        consumer.entrySet().stream().forEach(e -> System.out.println(e.getValue()));
    }
}
