package nl.frisodobber.spark.service;

import nl.frisodobber.spark.model.ApiService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by dobber on 22-11-16.
 */
public class SparkService {

    public Map<String, String> getKeyValues() {
        Map<String, String> keyValueMap = new HashMap<>();
        keyValueMap.put("key1", "value1");
        keyValueMap.put("key2", "value2");
        return keyValueMap;
    }

    public <T> Supplier<T> getEntity(Class<T> clazz) {
        Supplier<T> entity = () -> mockApiService();
        return entity;
    }

    private <T> T mockApiService() {
        ApiService mockApiService = new ApiService();
        mockApiService.setName("Heater");
        mockApiService.setToken("12345");
        mockApiService.setUrl("https://localhost:9393/heater/api/");
        mockApiService.setFunctionNames(new ArrayList<String>() {{ add("A"); add("B"); add("C"); }});
        return (T) mockApiService;
    }
}
