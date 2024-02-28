public class Currency {
    // Currencies have a name and an exchange rate.
    // Currencies are created in the CurrencyHolder's constructor.
    private final String name;
    private final double rate;

    public Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public String toString() {
        return this.name;
    }
}
