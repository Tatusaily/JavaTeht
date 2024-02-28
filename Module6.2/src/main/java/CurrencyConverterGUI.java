import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.ChoiceBox;
import javafx.stage.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class CurrencyConverterGUI extends Application {
    Parent xml;

    @Override
    public void start(Stage stage) throws Exception {
        // initialize the GUI
        this.xml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main.fxml")));
        stage.setTitle("Currency Converter");
        stage.setScene(new Scene(this.xml));
        stage.show();

        // set the currencies in the GUI
        Controller controller = Controller.getInstance();
        ArrayList<Currency> currencies = controller.getCurrencies();
        ChoiceBox<Currency> fromCurrency = (ChoiceBox<Currency>) this.xml.lookup("#fromChoice");
        ChoiceBox<Currency> toCurrency = (ChoiceBox<Currency>) this.xml.lookup("#toChoice");
        fromCurrency.getItems().addAll(currencies);
        toCurrency.getItems().addAll(currencies);
        fromCurrency.setValue(currencies.get(0));
        toCurrency.setValue(currencies.get(1));

    }

}
