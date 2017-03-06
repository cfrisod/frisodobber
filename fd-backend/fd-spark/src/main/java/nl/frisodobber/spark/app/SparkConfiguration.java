package nl.frisodobber.spark.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by dobber on 21-11-16.
 */
public class SparkConfiguration {
    private static Logger LOGGER = LoggerFactory.getLogger(SparkConfiguration.class);

    private static Properties config = new Properties();

    static {
        try(InputStream input = SparkConfiguration.class.getClassLoader().getResourceAsStream("config.properties")) {
            config.load(input);
        } catch (FileNotFoundException e) {
            LOGGER.error("FileNotFoundException: ", e);
        } catch (IOException e) {
            LOGGER.error("IOException: ", e);
        }
    }

    public static int getWebPort() {
        return Integer.valueOf(config.getProperty("spark.web.port"));
    }
}
