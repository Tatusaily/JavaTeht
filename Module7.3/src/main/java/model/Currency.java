package model;

public class Currency {
    // Currencies have a name and an exchange rate.
    private final String name;
    private final double rate;
    private final String abbr;

    public Currency(String name, double rate, String abbr) {
        this.name = name;
        this.rate = rate;
        this.abbr = abbr;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }
    public String getAbbr() {
        return abbr;
    }
    public String toString() {
        return this.name;
    }
}
