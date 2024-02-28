import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

import java.util.Objects;

public class CurrencyConverterGUI extends Application {
    Parent xml;


    @Override
    public void start(Stage stage) throws Exception {
        this.xml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main.fxml")));
        stage.setTitle("Currency Converter");
        stage.setScene(new Scene(this.xml));
        stage.show();
    }

}
