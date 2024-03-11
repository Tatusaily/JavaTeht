package view;

import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.*;
import model.Currency;

import java.net.URL;
import java.util.List;
import java.util.Objects;

public class CurrencyConverterGUI extends Application {
    private Controller controller;
    @Override
    public void start(Stage stage) throws Exception {
        // initialize the GUI
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        this.controller = loader.getController();
        stage.setScene(new Scene(root));
        stage.show();
        controller.initGui();
    }
}
