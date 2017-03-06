package nl.frisodobber.spark.app;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import static spark.Spark.port;

import nl.frisodobber.spark.api.SparkApi;
import org.jboss.weld.environment.se.events.ContainerInitialized;

/**
 * Created by dobber on 21-11-16.
 */
public class SparkInit {
    @Inject
    private SparkApi sparkApi;

    public void main(@Observes ContainerInitialized event) {
        port(SparkConfiguration.getWebPort());
        sparkApi.init();
    }
}
