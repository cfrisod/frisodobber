package nl.frisodobber.java8.time;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/**
 * Created by dobber on 31-1-17.
 */
public class Java7Path {

    public static void main(String... args) throws URISyntaxException, IOException {
        Path path = Paths.get(Java7Path.class.getClassLoader().getResource("empty.properties").toURI());
        FileTime lastModified = Files.getLastModifiedTime(path);
        System.out.println(lastModified);
    }
}
