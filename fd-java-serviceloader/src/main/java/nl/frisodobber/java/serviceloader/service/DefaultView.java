package nl.frisodobber.java.serviceloader.service;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
/**
 * Created by dobber on 7-12-16.
 */
public class DefaultView implements View {
    @Override
    public String getName() {
        return "Default View";
    }

    @Override
    public Node getView() {
        Label label = new Label("The label");
        label.setPadding(new Insets(5, 10, 0, 0));
        TextField text = new TextField();

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(50, 50, 50, 50));
        hbox.getChildren().add(label);
        hbox.getChildren().add(text);
        return hbox;
    }
}
