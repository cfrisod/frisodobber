package nl.frisodobber.spark.service;

import java.util.HashMap;
import java.util.Map;

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
}
