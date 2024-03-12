package controller;

import dao.CurrencyDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import model.Currency;
import view.CurrencyConverterGUI;
import java.util.List;

public class Controller {
    private final CurrencyDao currencyDao = new CurrencyDao();
    private final CurrencyConverterGUI appGui = new CurrencyConverterGUI();
    public Controller() {
    }
    public List<Currency> getCurrencies() {
        return currencyDao.getAllCurrencies();
    }

    public void startApp() {
        System.out.println("Starting the app");
        CurrencyConverterGUI.launch(CurrencyConverterGUI.class);
    }
    public void initGui() {
        populateCurrencies(getCurrencies());
    }
    public void populateCurrencies(List<Currency> currencies){
        fromChoice.getItems().addAll(currencies);
        toChoice.getItems().addAll(currencies);
        fromChoice.setValue(currencies.get(0));
        toChoice.setValue(currencies.get(1));
    }

    // FXML POINTERS
    @FXML
    private Button convertButton;
    @FXML
    private ChoiceBox<Currency> fromChoice;
    @FXML
    private ChoiceBox<Currency> toChoice;
    @FXML
    private TextField amountText;
    @FXML
    private TextField resultText;

    public void convert(ActionEvent actionEvent) {
        double amount = Double.parseDouble(amountText.getText());
        Currency from = fromChoice.getValue();
        Currency to = toChoice.getValue();
        double result = amount*from.getRate()/to.getRate();
        result = Math.round(result * 100.0) / 100.0;
        resultText.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        CurrencyConverterGUI.launch(CurrencyConverterGUI.class);
    }
}
