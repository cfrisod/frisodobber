package nl.frisodobber.java.serviceloader.view;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.TextArea;

import nl.frisodobber.java.serviceloader.service.View;

/**
 * Created by dobber on 7-12-16.
 */
public class SimpleView implements View {
    @Override
    public String getName() {
        return "Simple View";
    }

    @Override
    public Node getView() {
        final TextArea textArea = new TextArea();
        textArea.setPrefRowCount(50);
        textArea.setPrefColumnCount(50);
        textArea.setPadding(new Insets(50, 50, 50, 50));

        return textArea;
    }
}
