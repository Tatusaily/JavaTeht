import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
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
        Button convertButton = (Button) this.xml.lookup("#convertButton");

        // set the event handler for the convert button
        convertButton.setOnAction(e -> {
            double amount = Double.parseDouble(((javafx.scene.control.TextField) this.xml.lookup("#amountText")).getText());
            Currency from = fromCurrency.getValue();
            Currency to = toCurrency.getValue();
            double result = controller.convert(from, to, amount);
            result = Math.round(result * 100.0) / 100.0;
            TextField resultText = (TextField) this.xml.lookup("#resultText");
            resultText.setText(String.valueOf(result));
        });
    }

}
