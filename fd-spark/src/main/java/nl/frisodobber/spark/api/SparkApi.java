package nl.frisodobber.spark.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import nl.frisodobber.spark.service.SparkService;
import spark.servlet.SparkApplication;

import javax.inject.Inject;

import static spark.Spark.get;

/**
 * Created by dobber on 22-11-16.
 */
public class SparkApi implements SparkApplication {
    @Inject
    private SparkService sparkService;

    private Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    public void init() {
        get("/hello", (req, res) -> gson.toJson(sparkService.getKeyValues()));
    }
}
