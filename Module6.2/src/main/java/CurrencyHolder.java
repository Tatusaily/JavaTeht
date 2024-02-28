import java.util.ArrayList;

public class CurrencyHolder {
    // CurrencyHolder is a singleton class that holds the currencies and their exchange rates.
    // It has a private constructor and a static method to get the instance of the class.
    private final ArrayList<Currency> currencies = new ArrayList<>();
    private static CurrencyHolder instance = null;

    private CurrencyHolder() {
        // Some hard-coded currencies and their exchange rates
        this.currencies.add(new Currency("USD", 1.0));
        this.currencies.add(new Currency("EUR", 0.85));
        this.currencies.add(new Currency("GBP", 0.75));
        this.currencies.add(new Currency("JPY", 110.0));
        this.currencies.add(new Currency("CNY", 6.5));
        this.currencies.add(new Currency("RUB", 75.0));
        this.currencies.add(new Currency("INR", 75.0));
        this.currencies.add(new Currency("AUD", 1.3));
        this.currencies.add(new Currency("CAD", 1.25));
        this.currencies.add(new Currency("CHF", 0.9));
    }
    public static CurrencyHolder getInstance() {
        // Singleton
        if (instance == null) {
            instance = new CurrencyHolder();
        }
        return instance;
    }

    public ArrayList<Currency> getCurrencies() {
        return this.currencies;
    }
}
