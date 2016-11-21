package nl.frisodobber.spark.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by dobber on 21-11-16.
 */
public class SparkInit {
    public static void main(String[] args) {
        port(SparkConfiguration.getWebPort());
        Map<String, String> helloMap = new HashMap<>();
        helloMap.put("hello", "Hello World");
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        get("/hello", (req, res) -> gson.toJson(helloMap));
    }
}
