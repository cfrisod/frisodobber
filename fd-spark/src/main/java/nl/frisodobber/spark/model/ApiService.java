package nl.frisodobber.spark.model;

import java.util.List;

/**
 * Created by dobber on 4-12-16.
 */
public class ApiService {
    private String name;
    private String url;
    private String token;
    private List<String> functionNames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<String> getFunctionNames() {
        return functionNames;
    }

    public void setFunctionNames(List<String> functionNames) {
        this.functionNames = functionNames;
    }
}
