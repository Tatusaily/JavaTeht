package view;

/*
The application implements an electronic dice that can be used to play board games. The application has a button that rolls the dice. When the user clicks the button, the application generates a random number between 1 and 6 and displays it on the screen. The user interfice also provides the possibility to change the number of sides of the dice. Thus, you can use the application to throw a regular 6-side dice, or, if you wish, a role-player's dice with 20 sides.

 */

import controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class DictionaryView extends Application {

    // initialize components that need to be accessed from multiple methods
    private TextField wordfield = new TextField();
    private TextField meaningfield = new TextField();
    private DictionaryController controller;
    private TextArea resultarea = new TextArea();

    public void start(Stage stage) {

        Button addButton = new Button("Add");
        Button searchButton = new Button("Search");
        FlowPane pane = new FlowPane();

        stage.setTitle("Dictionary Library");

        // add outside margins for components
        Insets insets = new Insets(10, 10, 10, 10);
        pane.setMargin(addButton, insets);
        pane.setMargin(searchButton, insets);
        pane.setMargin(wordfield, insets);
        pane.setMargin(meaningfield, insets);
        pane.setMargin(resultarea, insets);

        pane.getChildren().add(wordfield);
        pane.getChildren().add(meaningfield);
        pane.getChildren().add(addButton);
        pane.getChildren().add(searchButton);
        pane.getChildren().add(resultarea);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        // add functionality for buttons:
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                try {
                    String word = wordfield.getText();
                    String meaning = meaningfield.getText();
                    controller.add(word, meaning);
                    resultarea.setText("Word added");
                } catch (Exception e) {
                    resultarea.setText("Invalid input");
                }
            }
        });
        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                try {
                    String word = wordfield.getText();
                    String result = controller.search(word);
                    resultarea.setText(result);
                } catch (Exception e) {
                    resultarea.setText("Word not found");
                }

            }
        });

        stage.show();
    }

    public void setController(DictionaryController controller) {
        this.controller = controller;
    }


    public void setResult(int result) {
        this.meaningfield.setText(String.valueOf(result));
    }
}

