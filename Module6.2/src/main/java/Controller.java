import java.util.ArrayList;

public class Controller {
    // Singleton contoller. Interfaces with the GUI.
    private static Controller instance = null;
    private final CurrencyHolder currencyHolder = CurrencyHolder.getInstance();

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    public ArrayList<Currency> getCurrencies() {
        return currencyHolder.getCurrencies();
    }
    public double convert(Currency from, Currency to, double amount) {
        return amount * from.getRate() / to.getRate();
    }
}
